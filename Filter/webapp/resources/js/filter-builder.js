/**
 * Java script function for filter tool
 */

 $( document ).ready(function() {
	$('#btnSave').click(function() {
		var filter = addFilter();
		createFilterSubmitForm();
		$('#filterData').val(JSON.stringify(filter));
		$('#filterForm').submit();
		
	});
});
 function createFilterSubmitForm() {
		var form = $('<form id="filterForm"></form>').attr({
			method : 'POST',
			action : '/Filter/filterAction/add'
		}).appendTo('body');
		$('<input type="hidden" id="filterData" name="filterData" />').appendTo(form);
	} 
 
function addFilter() {
	var filterType = null;
	var temp = '';
	var name = $('#fName').val();
	var displayName = $('#fDisplayName').val();
	$('filter-type').each(function() {
		if($(this).is(':checked')) {
			temp+=$(this).val() + ',';
		}
	});
	if(temp!='') {
		filterType = temp;
		filterType = filterType.substr(0,filterType.length-1);
	}
	var filter = {
		    "name": name,
		    "displayName": displayName,
		    "filterType":filterType
		}
	return filter;
}