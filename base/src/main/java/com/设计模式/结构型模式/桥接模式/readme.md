#定义桥接模式(Bridge Pattern)：将抽象部分与它的实现部分分离，使它们都可以独立地变化。
#为啥要用桥接模式？桥接模式解决了什么问题？
假设场景1：颜色图像-图形[长方形、正方形、圆形..]，颜色[红、绿、蓝..],进行搭配。
假设场景2：颜色毛笔-大小[小大、中、小..],颜色[红、绿、蓝..]
假设场景3：日记系统-日志类型[交易日志、数据库日志、用户操作日志..]，日志形式[xml文件、文本文件、数据库数据、E-mail...]
假设场景4：跨平台视频播放器-各操作系统[windows、linux、unix、os..],视频格式[MPEG、RMVB、AVI、WMV..]
#桥接模式包含如下角色：
Abstraction-抽象类
RefinedAbstraction-扩充抽象类
Implementor-实现接口
ConcreteImplementor-接口具体实现


