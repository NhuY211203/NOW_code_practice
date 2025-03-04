package com.company.state;

interface EmployeeState {
    void handleRequest();
}

class DoiTruongState implements EmployeeState {
    @Override
    public void handleRequest() {
        System.out.println("Công việc của Đội trưởng:");
        System.out.println("- Đi tuần kiểm tra");
        System.out.println("- Gán việc cho nhân viên");
    }
}

class GiamDocState implements EmployeeState {
    @Override
    public void handleRequest() {
        System.out.println("Công việc của Giám đốc:");
        System.out.println("- Quản lý toàn bộ công ty");
        System.out.println("- Ra quyết định chiến lược");
    }
}

class NhanVienVPState implements EmployeeState {
    @Override
    public void handleRequest() {
        System.out.println("Công việc của Nhân viên Văn phòng:");
        System.out.println("- Pha trà");
        System.out.println("- Phê duyệt tài liệu");
    }
}

class NhanVienXuongState implements EmployeeState {
    @Override
    public void handleRequest() {
        System.out.println("Công việc của Nhân viên Xưởng:");
        System.out.println("- Sản xuất sản phẩm");
        System.out.println("- Bảo trì máy móc");
    }
}

class KeToanTruongState implements EmployeeState {
    @Override
    public void handleRequest() {
        System.out.println("Công việc của Kế toán trưởng:");
        System.out.println("- Quản lý tài chính");
        System.out.println("- Lập báo cáo tài chính");
    }
}

public class StatePattern {
    private EmployeeState state;

    public StatePattern(String chucVu) {
        setState(chucVu);
    }

    public void setState(String chucVu) {
        switch (chucVu) {
            case "Đội trưởng":
                this.state = new DoiTruongState();
                break;
            case "Giám đốc":
                this.state = new GiamDocState();
                break;
            case "Nhân viên VP":
                this.state = new NhanVienVPState();
                break;
            case "Nhân viên Xưởng":
                this.state = new NhanVienXuongState();
                break;
            case "Kế toán trưởng":
                this.state = new KeToanTruongState();
                break;
            default:
                System.out.println("Chức vụ không hợp lệ!");
                this.state = null;
        }
    }

    public void handleRequest() {
        if (state != null) {
            state.handleRequest();
        }
    }

    public static void main(String[] args) {
        StatePattern dt = new StatePattern("Đội trưởng");
        dt.handleRequest();

        StatePattern gd = new StatePattern("Giám đốc");
        gd.handleRequest();

        StatePattern nvvp = new StatePattern("Nhân viên VP");
        nvvp.handleRequest();

        StatePattern nvx = new StatePattern("Nhân viên Xưởng");
        nvx.handleRequest();

        StatePattern kt = new StatePattern("Kế toán trưởng");
        kt.handleRequest();
    }
}