import { TestBed } from '@angular/core/testing';

import { DataAccessedService } from './data-accessed.service';

describe('DataAccessedService', () => {
  let service: DataAccessedService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DataAccessedService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
