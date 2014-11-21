/**
 * 
 */

 $( document ).ready(function() {
	$('#btnSave').click(function() {
		alert('zzzzz');
	});
});
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