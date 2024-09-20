import { VStack, Wrap, WrapItem } from '@chakra-ui/react';
import { FunctionComponent, useMemo, useEffect } from 'react';
import { useAuthorization } from '../../../../common/components/auth';
import { Card } from '../../../../common/components/card';

export const LandingPage: FunctionComponent = () => {
  const authorization = useAuthorization();
  const applicationsV2 = authorization?.applicationData.applicationsV2;
  const cards = useMemo(() => {
    return Object.entries(applicationsV2 ?? {})
      .map(([, value]) => ({
        appId: value.app_id,
        title: value.app_name,
        icon: value.app_icon,
        description: value.app_description,
        isDisabled: !value.app_enabled,
        url: value.app_url,
        category: value?.app_category
      }))
      .filter((app) => !app.isDisabled)
      .sort((a, b) => a.title.localeCompare(b.title));
  }, [authorization?.applicationData.applicationsV2]);

  // Prevent back navigation
  useEffect(() => {
    // Push a new state to the history stack
    window.history.pushState(null, '', window.location.href);

    // Function to handle popstate event
    const handlePopState = (event) => {
      // Push another state to prevent going back
      window.history.pushState(null, '', window.location.href);
    };

    // Listen for popstate events
    window.addEventListener('popstate', handlePopState);

    // Cleanup event listener on unmount
    return () => {
      window.removeEventListener('popstate', handlePopState);
    };
  }, []);

  return (
    <VStack overflowY="auto">
      <Wrap spacing={'48px'} pt={'40px'}>
        {cards.map((card, i) => (
          <WrapItem key={i}>
            <Card {...card} />
          </WrapItem>
        ))}
      </Wrap>
    </VStack>
  );
};

export default LandingPage;



***************************************************************************************************************************************************************************************



import { VStack, Wrap, WrapItem } from '@chakra-ui/react';
import { FunctionComponent, useMemo, useEffect } from 'react';
import { useAuthorization } from '../../../../common/components/auth';
import { Card } from '../../../../common/components/card';

export const LandingPage: FunctionComponent = () => {
  const authorization = useAuthorization();
  const applicationsV2 = authorization?.applicationData.applicationsV2;

  const cards = useMemo(() => {
    return Object.entries(applicationsV2 ?? {})
      .map(([, value]) => ({
        appId: value.app_id,
        title: value.app_name,
        icon: value.app_icon,
        description: value.app_description,
        isDisabled: !value.app_enabled,
        url: value.app_url,
        category: value?.app_category
      }))
      .filter((app) => !app.isDisabled)
      .sort((a, b) => a.title.localeCompare(b.title));
  }, [authorization?.applicationData.applicationsV2]);

  useEffect(() => {
    const preventBackNavigation = (event: PopStateEvent) => {
      event.preventDefault();
      window.history.pushState(null, '', window.location.pathname);
    };

    window.history.pushState(null, '', window.location.pathname);
    window.addEventListener('popstate', preventBackNavigation);

    return () => {
      window.removeEventListener('popstate', preventBackNavigation);
    };
  }, []);

  return (
    <VStack overflowY="auto">
      <Wrap spacing={'48px'} pt={'40px'}>
        {cards.map((card, i) => (
          <WrapItem key={i}>
            <Card {...card} />
          </WrapItem>
        ))}
      </Wrap>
    </VStack>
  );
};

export default LandingPage;