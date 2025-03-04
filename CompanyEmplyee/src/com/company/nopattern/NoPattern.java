package com.company.nopattern;

public class NoPattern {
    private String chucVu;

    public NoPattern(String chucVu) {
        this.chucVu = chucVu;
    }

    public void handleRequest() {
        if (chucVu.equals("Đội trưởng")) {
            System.out.println("Công việc của Đội trưởng:");
            System.out.println("- Đi tuần kiểm tra");
            System.out.println("- Gán việc cho nhân viên");
        } else if (chucVu.equals("Giám đốc")) {
            System.out.println("Công việc của Giám đốc:");
            System.out.println("- Quản lý toàn bộ công ty");
            System.out.println("- Ra quyết định chiến lược");
        } else if (chucVu.equals("Nhân viên VP")) {
            System.out.println("Công việc của Nhân viên Văn phòng:");
            System.out.println("- Pha trà");
            System.out.println("- Phê duyệt tài liệu");
        } else if (chucVu.equals("Nhân viên Xưởng")) {
            System.out.println("Công việc của Nhân viên Xưởng:");
            System.out.println("- Sản xuất sản phẩm");
            System.out.println("- Bảo trì máy móc");
        } else if (chucVu.equals("Kế toán trưởng")) {
            System.out.println("Công việc của Kế toán trưởng:");
            System.out.println("- Quản lý tài chính");
            System.out.println("- Lập báo cáo tài chính");
        } else {
            System.out.println("Chức vụ không hợp lệ!");
        }
    }

    public static void main(String[] args) {
        NoPattern dt = new NoPattern("Đội trưởng");
        dt.handleRequest();

        NoPattern gd = new NoPattern("Giám đốc");
        gd.handleRequest();

        NoPattern nvvp = new NoPattern("Nhân viên VP");
        nvvp.handleRequest();

        NoPattern nvx = new NoPattern("Nhân viên Xưởng");
        nvx.handleRequest();

        NoPattern kt = new NoPattern("Kế toán trưởng");
        kt.handleRequest();
    }
}