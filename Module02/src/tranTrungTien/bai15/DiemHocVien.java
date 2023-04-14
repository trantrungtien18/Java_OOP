package tranTrungTien.bai15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiemHocVien {
	private String name;
	private LocalDate dateOfB;
	private double diemMon1;
	private double diemMon2;
	private double diemMon3;
	private double diemMon4;
	private double diemMon5;
	
	public DiemHocVien() {
		this.name = "Chua xac dinh";
		this.dateOfB = LocalDate.now();
		this.diemMon1 = 0;
		this.diemMon2 = 0;
		this.diemMon3 = 0;
		this.diemMon4 = 0;
		this.diemMon5 = 0;
	}

	public DiemHocVien(String name, LocalDate dateOfB, double diemMon1, double diemMon2, double diemMon3,
			double diemMon4, double diemMon5) {
		setName(name);
		this.dateOfB = dateOfB;
		setDiemMon1(diemMon1);
		setDiemMon2(diemMon2);
		setDiemMon3(diemMon3);
		setDiemMon4(diemMon4);
		setDiemMon5(diemMon5);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!(name.trim().equals("")))
			this.name = name;
		else
			this.name = "Chua xac dinh";
	}

	public LocalDate getDateOfB() {
		return dateOfB;
	}

	public void setDateOfB(LocalDate dateOfB) {
		this.dateOfB = dateOfB;
	}

	public double getDiemMon1() {
		return diemMon1;
	}

	public void setDiemMon1(double diemMon1) {
		if (!(diemMon1 < 0))
			this.diemMon1 = diemMon1;
		else
			this.diemMon1 = 0;
	}

	public double getDiemMon2() {
		return diemMon2;
	}

	public void setDiemMon2(double diemMon2) {
		if (!(diemMon2 < 0))
			this.diemMon2 = diemMon2;
		else
			this.diemMon2 = 0;
	}

	public double getDiemMon3() {
		return diemMon3;
	}

	public void setDiemMon3(double diemMon3) {
		if (!(diemMon3 < 0))
			this.diemMon3 = diemMon3;
		else
			this.diemMon3 = 0;
	}

	public double getDiemMon4() {
		return diemMon4;
	}

	public void setDiemMon4(double diemMon4) {
		if (!(diemMon4 < 0))
			this.diemMon4 = diemMon4;
		else
			this.diemMon4 = 0;
	}

	public double getDiemMon5() {
		return diemMon5;
	}

	public void setDiemMon5(double diemMon5) {
		if (!(diemMon5 < 0))
			this.diemMon5 = diemMon5;
		else
			this.diemMon5 = 0;
	}

	public double getDTB() {
		return (diemMon1 + diemMon2 + diemMon3 + diemMon4 + diemMon5) / 5;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-15s|%15s|%15s|%15s|%15s|%15s|%15s|%11s|", name, dtf.format(dateOfB), diemMon1, diemMon2,
				diemMon3, diemMon4, diemMon5, getDTB());
	}

}
