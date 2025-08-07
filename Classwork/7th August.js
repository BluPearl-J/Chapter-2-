let person = {
  firstName: "Feyi",
  lastName: "Onoja",
  age: 92,
  nationality: "Togolese"
};

for (let property in person) {
  if (property === "age") {
    console.log(`${property}: ${person[property]}`);
  }
}
