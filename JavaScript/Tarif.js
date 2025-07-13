// Tarif.js
const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

console.log("=== PERHITUNGAN TARIF KENDARAAN ===");
console.log("Silakan pilih jenis kendaraan:");
console.log("1. Mobil");
console.log("2. Truk / Motor");
console.log("3. Kendaraan Lainnya");

readline.question("Pilihan (1/2/3): ", (pilihan) => {
    readline.question("Masukkan jumlah roda: ", (roda) => {
        readline.question("Masukkan jarak tempuh (km): ", (jarak) => {
            let tarifDasar;
            switch (parseInt(pilihan)) {
                case 1:
                    tarifDasar = 10000;
                    break;
                case 2:
                    tarifDasar = 20000;
                    break;
                case 3:
                    tarifDasar = 30000;
                    break;
                default:
                    console.log("Pilihan tidak valid.");
                    readline.close();
                    return;
            }

            // Tarif tambahan berdasarkan jarak dan jumlah roda
            let tarifTambahan = jarak * roda;
            let totalTarif = tarifDasar + tarifTambahan;

            console.log("======================================");
            console.log(`Tarif dasar       : Rp ${tarifDasar.toString().replace(/\B(?=(\d))/g, ".")}`);
            console.log(`Tarif tambahan    : Rp ${tarifTambahan.toString().replace(/\B(?=(\d))/g, ".")} (jarak x roda)`);
            console.log(`Total tarif       : Rp ${totalTarif.toString().replace(/\B(?=(\d))/g, ".")}`);
            console.log("======================================");

            readline.close();
        });
    });
});
