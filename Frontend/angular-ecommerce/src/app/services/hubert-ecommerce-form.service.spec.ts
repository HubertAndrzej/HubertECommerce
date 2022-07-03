import { TestBed } from '@angular/core/testing';

import { HubertECommerceFormService } from './hubert-ecommerce-form.service';

describe('HubertECommerceFormService', () => {
  let service: HubertECommerceFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HubertECommerceFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
