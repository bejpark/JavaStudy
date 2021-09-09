// Emp클래스 - 사번,사원명,부서연락처,Output메소드(arrow function)

function Emp(empNo, empName) {
    this.empNo = empNo;
    this.empName = empName;
    this.getOutput = () => {
        console.log(`사번 : ${empNo}, 사원명 : ${empName}`)
    }
}

const person1 = new Emp(1, 'aa');
const person2 = new Emp(2, 'bb');
person1.getOutput()
person2.getOutput()


class Bicycle extends Vehicle {
    constructor(name, wheel) {
        super(name, wheel);
    }
}

class Car extends Vehicle {
    constructor(name, wheel) {
        super(name, wheel);
        this.license = license;
    }
}