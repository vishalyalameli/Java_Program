// const obj  = {a:1, b:2 , c:3}
// const Value = Object.values(obj);
// console.log(Value);

//   [ 1, 2, 3 ]



// Convert Object values to an Array ..........................................................
const person = { name: "John", age: 30, city: "Bengaluru" };

const valuesArray = Object.values(person);


console.log(valuesArray); // Output: ["John", 30, "Bengaluru"]
console.log(valuesArray1);


//Convert Object keys to an Array............................................................
const person2 = { name: "John", age: 30, city: "Bengaluru" };

const keysArray = Object.keys(person);

console.log(keysArray); // Output: ["name", "age", "city"]


//Convert Object entries (key-value pairs) to an Array ...............................................
const person3 = { name: "John", age: 30, city: "Bengaluru" };

const entriesArray = Object.entries(person);

console.log(entriesArray);
// Output: [["name", "John"], ["age", 30], ["city", "Bengaluru"]]


//Convert JSON-style object array to a value array......................................................

const users = [
    { id: 1, name: "Amit" },
    { id: 2, name: "Neha" },
    { id: 3, name: "Raj" }
  ];
  
  const names = users.map(user => user.name);
  
  console.log(names); // Output: ["Amit", "Neha", "Raj"]
  