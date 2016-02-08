angular.module('app.books').controller('BookChangeTitleController', function ($scope,Flash,$modalInstance) {
    'use strict';

    $scope.newTitle = '';
                 
    $scope.makeNewTitle = function () {    
        Flash.create('success', 'Tytul zostal zmieniony.', 'custom-class');
        $modalInstance.close($scope.newTitle);
        };     
});
