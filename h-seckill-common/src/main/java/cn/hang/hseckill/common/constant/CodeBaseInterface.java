package cn.hang.hseckill.common.constant;

public interface CodeBaseInterface {

    int getCode();

    String getMessage();

    enum StatusEnum implements CodeBaseInterface {
        /**
         * 使用
         */
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

    enum DefaultEnum implements CodeBaseInterface {
        /**
         * 使用
         */
        Default(1, "默认"),
        Not_Default(0, "非默认"),
        ;
        private int code;
        private String message;

        DefaultEnum(int code, String message) {
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

    enum ItemIsSeckillEnum implements CodeBaseInterface {
        /**
         * 删除
         */
        NOT_IN_SECKILL(0, "非秒杀商品"),
        IN_SECKILL(1, "秒杀商品"),
        ;

        private int code;
        private String message;

        ItemIsSeckillEnum(int code, String message) {
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
