package com.company.strategy;

interface EmployeeBehavior {
    void handleRequest();
}

class DoiTruongBehavior implements EmployeeBehavior {
    @Override
    public void handleRequest() {
        System.out.println("Công việc của Đội trưởng:");
        System.out.println("- Đi tuần kiểm tra");
        System.out.println("- Gán việc cho nhân viên");
    }
}

class GiamDocBehavior implements EmployeeBehavior {
    @Override
    public void handleRequest() {
        System.out.println("Công việc của Giám đốc:");
        System.out.println("- Quản lý toàn bộ công ty");
        System.out.println("- Ra quyết định chiến lược");
    }
}

class NhanVienVPBehavior implements EmployeeBehavior {
    @Override
    public void handleRequest() {
        System.out.println("Công việc của Nhân viên Văn phòng:");
        System.out.println("- Pha trà");
        System.out.println("- Phê duyệt tài liệu");
    }
}

class NhanVienXuongBehavior implements EmployeeBehavior {
    @Override
    public void handleRequest() {
        System.out.println("Công việc của Nhân viên Xưởng:");
        System.out.println("- Sản xuất sản phẩm");
        System.out.println("- Bảo trì máy móc");
    }
}

class KeToanTruongBehavior implements EmployeeBehavior {
    @Override
    public void handleRequest() {
        System.out.println("Công việc của Kế toán trưởng:");
        System.out.println("- Quản lý tài chính");
        System.out.println("- Lập báo cáo tài chính");
    }
}

public class StrategyPattern {
    private EmployeeBehavior behavior;

    public StrategyPattern(String chucVu) {
        setBehavior(chucVu);
    }

    public void setBehavior(String chucVu) {
        switch (chucVu) {
            case "Đội trưởng":
                this.behavior = new DoiTruongBehavior();
                break;
            case "Giám đốc":
                this.behavior = new GiamDocBehavior();
                break;
            case "Nhân viên VP":
                this.behavior = new NhanVienVPBehavior();
                break;
            case "Nhân viên Xưởng":
                this.behavior = new NhanVienXuongBehavior();
                break;
            case "Kế toán trưởng":
                this.behavior = new KeToanTruongBehavior();
                break;
            default:
                System.out.println("Chức vụ không hợp lệ!");
                this.behavior = null;
        }
    }

    public void handleRequest() {
        if (behavior != null) {
            behavior.handleRequest();
        }
    }

    public static void main(String[] args) {
        StrategyPattern dt = new StrategyPattern("Đội trưởng");
        dt.handleRequest();

        StrategyPattern gd = new StrategyPattern("Giám đốc");
        gd.handleRequest();

        StrategyPattern nvvp = new StrategyPattern("Nhân viên VP");
        nvvp.handleRequest();

        StrategyPattern nvx = new StrategyPattern("Nhân viên Xưởng");
        nvx.handleRequest();

        StrategyPattern kt = new StrategyPattern("Kế toán trưởng");
        kt.handleRequest();
    }
}