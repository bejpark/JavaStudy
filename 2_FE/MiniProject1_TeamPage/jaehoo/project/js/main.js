var ul = document.querySelector('.slide_wrap');
var firstItemClone = ul.firstElementChild.cloneNode(true);
ul.appendChild(firstItemClone);
        function move(){
 
            var curIndex = 0;
 
            setInterval(function(){
                ul.style.transition = '0.2s';
                ul.style.transform = "translate3d(-"+1280*(curIndex+1)+"px, 0px, 0px)";
 
                curIndex++;
 
                if(curIndex === 5){
                    setTimeout(function(){
                        ul.style.transition = '0s';
                        ul.style.transform = "translate3d(0px, 0px, 0px)";
                    },201)
                    curIndex = 0;
                }
 
            },1000);
        }
        
        document.addEventListener("DOMContentLoaded",function(){
            move();
        });
