package com.base.Enum;

public enum Color implements ShowContent {
    Red("红色", 1, "热情"),
    Blue("绿色", 2, "生机"),
    Green("蓝色", 3, "阔达"),
    Black("黑色", 1),
    White("白色", 2),
    Yellow {
        public void show() {
            System.out.println("我是黄色");
        }

        public void meaning(Color color) {
            System.out.println("黄色");
        }
    };
    private String name;
    private Integer index;
    private String content;

    Color() {
    }

    Color(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    Color(String name, int index, String content) {
        this.name = name;
        this.index = index;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void meaning(Color color) {
        System.out.println(this.content);
    }
}