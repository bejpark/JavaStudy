const toAboutme = document.querySelector('.btn-aboutme');
const toContact = document.querySelector('.btn-contact');
console.log(toAboutme);
toAboutme.addEventListener('click', function() {
    gsap.to(window, .7, {
        scrollTo: 750
    })
})

toContact.addEventListener('click', function() {
    gsap.to(window, .7, {
        scrollTo: 1500
    })
})