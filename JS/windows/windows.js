console.log('window object',window)
console.log('this keyword',this)
console.log(this===window)

//  window.alert('welcome to Java script')
//  alert('welcome to UST global and Test yantra')

//  let confirmDelete = confirm('are you sure you want to delete')
//  console.log('confirmdelete',confirmDelete)

let userName = prompt('what is your name','manasa')
console.log('username',userName)

const person = {
    firstName:'cream',
    age:21,
    lastName:'oreo',
    getName:function(){
        console.log(this)
        return this.firstName+''+this.lastName
    }
}
let fullName = person.getName()
console.log('full name',fullName)