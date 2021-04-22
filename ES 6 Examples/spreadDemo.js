function demo(a, b, ...c) {
    console.log("a: "+a+", b: "+b+", c: "+c);
}
var items = [1, 2, 3, 4, 5];
demo(...items);