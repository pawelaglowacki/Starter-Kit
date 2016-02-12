describe('author rest service', function () {
	'use strict';
  var authorRestService,
      httpBackend;
  
  beforeEach(function (){  

      module('app.main');
      module('flash');
      module('app.authors');

    inject(function($httpBackend, _authorRestService_) {
      authorRestService = _authorRestService_;      
      httpBackend = $httpBackend;
    });
  });
  
  afterEach(function() {
    httpBackend.verifyNoOutstandingExpectation();
    httpBackend.verifyNoOutstandingRequest();
  });

  it('should get respond when call URL', inject(function (currentContextPath){

    var returnData = {firstName: 'first',lastName: 'last'};
    

    httpBackend.expectGET(currentContextPath.get() + 'rest/authors/author').respond(returnData);
    

    var returnedPromise = authorRestService.searchAuthors();
    

    var result;
    returnedPromise.then(function(response) {
      result = response;
    });
    
    httpBackend.flush();
    
    expect(result.data).toEqual(returnData);
  }));  
});