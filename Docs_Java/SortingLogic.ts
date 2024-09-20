import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SurveyService {

  sortMetaData(surveyVariableMetaData: any): any {
    const sortedMeta: any = {};

    for (const key in surveyVariableMetaData) {
      if (surveyVariableMetaData.hasOwnProperty(key)) {
        sortedMeta[key] = this.sortMetaDataForKey(surveyVariableMetaData[key]);
      }
    }

    return sortedMeta;
  }

  private sortMetaDataForKey(data: any): any {
    const sortedEntries = Object.entries(data).sort((a, b) => {
      const aNum = this.getSortNumber(a[1]);
      const bNum = this.getSortNumber(b[1]);
      return aNum - bNum;
    });

    const sortedData: any = {};
    let sortOrder = 1;

    for (const [key, value] of sortedEntries) {
      sortedData[key] = sortOrder;
      sortOrder++;
    }

    return sortedData;
  }

  private getSortNumber(value: any): number {
    if (value === 'NA') {
      return Number.MAX_SAFE_INTEGER;
    }

    const match = value.match(/\d+/);
    return match ? parseInt(match[0], 10) : 0;
  }
}