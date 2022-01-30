var MinStack = function () {
    this.values = [];
    this.orderedIndices = [];
    this.count = 0;
};

/** 
 * @param {number} val
 * @return {void}
 */
MinStack.prototype.push = function (val) {

    this.values.push(val);
    
    let i;

    for (i = 0; i < this.orderedIndices.length; i++)
        if (val < this.values[this.orderedIndices[i]]){
            this.orderedIndices.splice(i, 0, this.values.length-1);
            break;
        }
    
    if(i == this.orderedIndices.length)
        this.orderedIndices.push(this.values.length-1);


    this.count++;

    // console.log('values now: '+this.values);
    // console.log('ordered now: '+this.orderedIndices);

};

/**
 * @return {void}
 */
MinStack.prototype.pop = function () {

    let l = this.values.length - 1;

    this.orderedIndices.splice(this.orderedIndices.indexOf(l), 1);
    this.values.pop();
};

/**
 * @return {number}
 */
MinStack.prototype.top = function () {
    return this.values[this.values.length-1];
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function () {

    return this.values[this.orderedIndices[0]];
};
/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */