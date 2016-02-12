describe('book changeTitle controller', function () {
    'use strict';

    beforeEach(function () {
        module('app.main');
        module('flash');
        module('app.books');
    });

    var $scope;
    var $modalInstance;
    beforeEach(inject(function ($rootScope) {
        $scope = $rootScope.$new(); 
        $modalInstance = {                   
                close: jasmine.createSpy('modalInstance.close'),
                dismiss: jasmine.createSpy('modalInstance.dismiss'),
                result: {
                  then: jasmine.createSpy('modalInstance.result.then')
                }
        };
    }));
    
    it('makeNewTitle is defined', inject(function ($controller) {
        // when
        $controller('BookChangeTitleController', {$scope: $scope,$modalInstance: $modalInstance}); 
        // then                                                                                    
        expect($scope.makeNewTitle).toBeDefined();
    }));
    
});