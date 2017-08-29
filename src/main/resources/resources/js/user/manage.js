$(document).ready(function() {
	$('#pagination-bar').twbsPagination({
		totalPages: 35,
		visiblePages: 7,
		onPageClick: function(event, page) {
			console.log(page);
		}
	})
});
