// $(document).ready(function() {
//     $('.ui-widget').click(function() {
//         $('#name').hide();
//         alert('indise html');
//         console.log('click');
//     });
// });
$("div>p").css("border", "3px dotted red");
$(document).ready(function() {
    $('.ui-widget').click(function() {
        $('#name').hide();
    });

});

$('ul li:first-child').fadeOut('slow');
// $('ul li:first').hide();