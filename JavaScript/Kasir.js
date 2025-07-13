// Kasir.js
const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

const menu = [
    ["Nasi Goreng", 25000, 0],
    ["Bakso", 15000, 0],
    ["Ayam Goreng", 20000, 0],
    ["Es Teh", 5000, 0],
    ["Es Jeruk", 7000, 0],
    ["Kopi", 8000, 0]
];

console.log("Selamat Datang di Warung Makan Kami!");
console.log("====================================");
console.log("Menu:");
console.log("------------------------------------");
menu.forEach((item, i) => {
    console.log(`[${i + 1}] ${item[0].padEnd(15)} Rp${item[1]}`);
});
console.log("------------------------------------");

let i = 0;
function ask() {
    if (i < menu.length) {
        readline.question(`Masukkan jumlah pesanan untuk ${menu[i][0]}: `, (jumlah) => {
            menu[i][2] = parseInt(jumlah) || 0;
            i++;
            ask();
        });
    } else {
        let totalHarga = menu.reduce((sum, item) => sum + item[1] * item[2], 0);
        console.log(`Total harga: Rp${totalHarga}`);
        readline.close();
    }
}
ask();