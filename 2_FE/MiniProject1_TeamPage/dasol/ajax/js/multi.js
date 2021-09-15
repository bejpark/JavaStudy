$(function(){
    $('#multi_menu li:nth-of-type(1)').hover(function(){
        $('#menu_1').show();
        $('#menu_2').hide();
        $('#menu_3').hide();
    });

    $('#multi_menu li:nth-of-type(2)').hover(function(){
        $('#menu_1').hide();
        $('#menu_2').show();
        $('#menu_3').hide();
    });

    $('#multi_menu li:nth-of-type(3)').hover(function(){
        $('#menu_1').hide();
        $('#menu_2').hide();
        $('#menu_3').show();
    });


});