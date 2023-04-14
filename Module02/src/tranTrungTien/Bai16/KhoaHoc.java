package tranTrungTien.Bai16;

import java.time.LocalDate;

public class KhoaHoc {
	private String nameCourse;
	private LocalDate openCourse;
	private int learningTime;
	private HocVien[] dsHocVien;

	public KhoaHoc(String nameCourse, LocalDate openCourse, int learningTime, HocVien[] dsHocVien) {
		super();
		setNameCourse(nameCourse);
		this.openCourse = openCourse;
		this.learningTime = learningTime;
		this.dsHocVien = new HocVien[20];
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		if (!(nameCourse.trim().equals("")))
			this.nameCourse = nameCourse;
		else
			this.nameCourse = "Chua xac dinh";
	}

	public LocalDate getOpenCourse() {
		return openCourse;
	}

	public void setOpenCourse(LocalDate openCourse) {
		this.openCourse = openCourse;
	}

	public int getLearningTime() {
		return learningTime;
	}

	public void setLearningTime(int learningTime) {
		this.learningTime = learningTime;
	}

	public HocVien[] getDsHocVien() {
		return dsHocVien;
	}

	public void setDsHocVien(HocVien[] dsHocVien) {
		this.dsHocVien = dsHocVien;
	}

	
}
