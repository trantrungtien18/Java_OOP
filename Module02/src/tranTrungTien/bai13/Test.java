package tranTrungTien.bai13;

public class Test {

	public static void main(String[] args) {
		CongNhan cn1 = new CongNhan("Nguyen Van", "An", 200);
		CongNhan cn2 = new CongNhan("Nguyen Minh", "Long", 50);
		CongNhan cn3 = new CongNhan("Luong Tan", "Dat", 250);
		CongNhan cn4 = new CongNhan("Hoang Van", "Thu", 100);
		CongNhan cn5 = new CongNhan("Phan Van", "Tri", 600);
		DanhSachCongNhan listCN = new DanhSachCongNhan(5);
		listCN.addCN(cn1);
		listCN.addCN(cn2);
		listCN.addCN(cn3);
		listCN.addCN(cn4);
		listCN.addCN(cn5);
		System.out.println("Danh sach cong nhan:\n" + listCN);
		System.out.println(listCN.getCN200SP());
		System.out.println("Sap xep cong nhan theo so luong san pham giam dan: ");
		listCN.sortCongNhan();
		System.out.println("Danh sach cong nhan sau khi sap xep:\n" + listCN);
	}

}
