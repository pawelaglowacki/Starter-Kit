describe('authorService tests', function (){
	'use strict';

  var authorService;
  
  beforeEach(function (){
    

      module('app.main');
      module('flash');
      module('app.authors');

    inject(function(_authorService_) {
    	authorService = _authorService_;
    });
  });
     
  it('should have an searchAuthors function', function () { 
    expect(angular.isFunction(authorService.searchAuthors)).toBe(true);
  });
  
  it('should make a responso from db', inject(function (authorRestService){

	spyOn(authorRestService, 'searchAuthors');
	authorService.searchAuthors();
    expect(authorRestService.searchAuthors).toHaveBeenCalled();
  }));
});