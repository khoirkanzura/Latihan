def tampilkan_produk(produk):
    print("=== DAFTAR PRODUK ONLINE SHOP ===")
    print("{:<5} {:<20} {:>10}".format("No", "Nama Produk", "Harga (Rp)"))
    print("-" * 40)
    for i, item in enumerate(produk, start=1):
        print("{:<5} {:<20} {:>10,}".format(i, item["nama"], item["harga"]))
    print("-" * 40)


def main():
    # Daftar produk
    produk = [
        {"nama": "Kaos Polos", "harga": 50000},
        {"nama": "Celana Jeans", "harga": 120000},
        {"nama": "Sepatu Sneakers", "harga": 250000},
        {"nama": "Topi Baseball", "harga": 35000},
        {"nama": "Jaket Hoodie", "harga": 150000}
    ]

    keranjang = []
    tampilkan_produk(produk)

    while True:
        try:
            pilih = int(input("Pilih nomor produk (0 untuk selesai): "))
            if pilih == 0:
                break
            elif 1 <= pilih <= len(produk):
                jumlah = int(input("Jumlah: "))
                item = produk[pilih - 1].copy()
                item["jumlah"] = jumlah
                item["total"] = item["harga"] * jumlah
                keranjang.append(item)
            else:
                print("Nomor produk tidak tersedia.")
        except ValueError:
            print("Input tidak valid, masukkan angka.")

    print("\n=== STRUK PEMBELIAN ===")
    total_bayar = 0
    for i, item in enumerate(keranjang, start=1):
        print(f"{i}. {item['nama']} x{item['jumlah']} = Rp{item['total']:,}")
        total_bayar += item["total"]
    print("------------------------------")
    print(f"TOTAL BAYAR: Rp{total_bayar:,}")
    print("Terima kasih sudah belanja di toko kami!")

if __name__ == "__main__":
    main()
