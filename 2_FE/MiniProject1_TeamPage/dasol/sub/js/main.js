const toOutline = document.getElementById('toOutline');
const toPreview = document.getElementById('toPreview');
const toCharacter = document.getElementById('toCharacter');
const toStory = document.getElementById('toStory');

toOutline.addEventListener('click',function(){
    gsap.to(window, .7, {
        scrollTo: 1830
    })
})
toPreview.addEventListener('click',function(){
    gsap.to(window, .7, {
        scrollTo: 2090
    })
})
toCharacter.addEventListener('click',function(){
    gsap.to(window, .7, {
        scrollTo: 2830
    })
})
toStory.addEventListener('click',function(){
    gsap.to(window, .7, {
        scrollTo: 3200
    })
})