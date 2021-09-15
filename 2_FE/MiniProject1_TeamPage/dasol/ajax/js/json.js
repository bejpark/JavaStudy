$(function(){

    $.ajax({
        url:"./json/bigDog.json",
        method:"GET",
        dataType:"json"})
        .done(function(data){
            if(data.length>0){
                for(var i in data){
                    var url = data[i].url;
                    var name = data[i].name;
                    var introduce = data[i].introduce;

                    $("#menu_1 .box").eq(i).append("<div class='img' style='background-image: url(./image/bigDog/"+url+");'></div>");
                    $("#menu_1 .box").eq(i).append("<h3>"+name+"</h3>");
                    $("#menu_1 .box").eq(i).append("<p>"+introduce+"</p>");
                };
            };
        })

        $.ajax({
            url:"./json/middleDog.json",
            method:"GET",
            dataType:"json"})
            .done(function(data){
                if(data.length>0){
                    for(var i in data){
                        var url = data[i].url;
                        var name = data[i].name;
                        var introduce = data[i].introduce;
    
                        $("#menu_2 .box").eq(i).append("<div class='img' style='background-image: url(./image/middleDog/"+url+");'></div>");
                        $("#menu_2 .box").eq(i).append("<h3>"+name+"</h3>");
                        $("#menu_2 .box").eq(i).append("<p>"+introduce+"</p>");
                    };
                };
            })

            $.ajax({
                url:"./json/smallDog.json",
                method:"GET",
                dataType:"json"})
                .done(function(data){
                    if(data.length>0){
                        for(var i in data){
                            var url = data[i].url;
                            var name = data[i].name;
                            var introduce = data[i].introduce;
        
                            $("#menu_3 .box").eq(i).append("<div class='img' style='background-image: url(./image/smallDog/"+url+");'></div>");
                            $("#menu_3 .box").eq(i).append("<h3>"+name+"</h3>");
                            $("#menu_3 .box").eq(i).append("<p>"+introduce+"</p>");
                        };
                    };
                })

});