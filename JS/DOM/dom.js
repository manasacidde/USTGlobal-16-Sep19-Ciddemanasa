let h1Element = document.getElementById('demo')
console.log('element =',h1Element)
console.log('element text=',h1Element.textContent)
h1Element.textContent='hi'
console.log('==============')
let buttonElement = document.createElement('button')
buttonElement.textContent = 'click me!!'
console.log('button element',buttonElement)

document.body.appendChild(buttonElement);
let ulElement = document.createElement('ul')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')

li1Element.textContent = 'java'
li2Element.textContent = 'js'
li3Element.textContent = 'sql'

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)

h1Element.style.color='red'
h1Element.style.fontSize='50PX'

function showMessage(){
    alert("hi hello welcome")
}
function changecolor(){
   let pElement = document.getElementById('mover')
   pElement.style.color='blue'
}
function removeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color='black'
 }

 function printHello(){
     console.log('hello')
     let userName = document.getElementById('username').value
     document.getElementById('showusername').textContent = userName
 }

let name = 'manasa'
let age = 21
let no = 9032734335
console.log('name is' + name + 'age is' + age+ 'no is' + no)
console.log(`name is ${name} age is ${age} no is ${no}`)
console.log(`2+2=${2+2}`)

