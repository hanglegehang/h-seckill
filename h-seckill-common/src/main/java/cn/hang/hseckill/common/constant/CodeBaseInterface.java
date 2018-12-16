package cn.hang.hseckill.common.constant;

public interface CodeBaseInterface {

    int getCode();

    String getMessage();

    enum StatusEnum implements CodeBaseInterface {
        USED(1, "使用"),
        NOT_USED(0, "不使用"),
        ;
        private int code;
        private String message;

        StatusEnum(int code, String message) {
            this.code = code;
            this.message = message;
        }

        @Override
        public int getCode() {
            return this.code;
        }

        @Override
        public String getMessage() {
            return this.message;
        }
    }

    enum DeleteEnum implements CodeBaseInterface {
        /**
         * 删除
         */
        DELETE(1, "删除"),
        NOT_DELETE(0, "未删除"),
        ;

        private int code;
        private String message;

        DeleteEnum(int code, String message) {
            this.code = code;
            this.message = message;
        }

        @Override
        public int getCode() {
            return this.code;
        }

        @Override
        public String getMessage() {
            return this.message;
        }
    }

    enum PanelPositionEnum implements CodeBaseInterface {
        /**
         * 删除
         */
        INDEX(0, "首页"),
        ;

        private int code;
        private String message;

        PanelPositionEnum(int code, String message) {
            this.code = code;
            this.message = message;
        }

        @Override
        public int getCode() {
            return this.code;
        }

        @Override
        public String getMessage() {
            return this.message;
        }
    }

}
