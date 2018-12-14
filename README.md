# MHXX_SaveEditor

使用方法：
1. 导出存档；
2. 找到存档文件“system”传到电脑里备份好，双击.jar执行文件加载它；
3. 修改，修改后记得按保存，另存为存档；
4. 将另存为的存档传回sd卡中覆盖原来的“system”
5. 导入存档；

幻化功能使用说明:
1. 请将防具按照(本体,幻化外形)为一组放在第一个箱子的第一行，可以放五组;<img src="https://lh3.googleusercontent.com/ryMYnhz0jt-cHqnJU8AHdZ7GIQCPTI1muAPstteRJL2d-JDQZJVgz5tc5eE7vKIlxyB1=s170">
2. 可以幻化二名DLC等防具，射手剑士装可以互相幻化；
3. 此幻化后，偶数位的防具不会融进去，所以还在，游戏解除合成后会多出一个lv1的防具
4. 同一系列的防具幻化效果相同（例：麒麟S射手胴可以将所有部位的防具幻化成麒麟S射手套的样式）

运行：<br />
1. 下载安装Java Jre8: https://www.java.com/zh_CN/download/ 或者 http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html 
2. 设置好运行环境：<br />
    a) 右键“我的电脑”，点“属性(R)”，点“高级系统设置”，点“环境变量(N)”;<br />
    b) 如果变量有path或PATH了（没有就新建），点开在最后添加“;<u>java安装目录</u>/bin”, 下划线上填你的java的安装目录；<br />

常见问题：<br />
Q: 为什么修改后没有效果？<br />
A: 修改后记得按“保存”按钮！请使用最新版本。<br />

Q: 护石／道具添加到哪里？<br />
A: 由于本修改器的理念是简单易用，护石或道具会自动添加到最靠前的空着的格子（类似打完任务转存道具素材／护石到箱子里）。<br />

Q: 能幻化武器吗？<br />
A: 这个问题非常有趣。如果用对防具相同的操作作用到武器上，武器会显示出幻化后的图标和名字，但是外观并没有变化(见最下面的图片)。为了防止修改器对护石和武器造成可能的破坏，我将其设计为能检测幻化与被幻化的是否是防具，不是的话会提示失败，不对存档进行任何操作。<br />

Q: 没破解的机子能改吗？<br />
A: 最根源的问题是系统能用hbl吗！系统能hbl->能改。只要系统能有办法进hbl，就可以通过hbl打开extdata_dump, jk manager, sdvt等存档工具。（9.2～11.3可以通过soundHax打开hbl）<br />

<img src="https://imgsa.baidu.com/forum/w%3D580/sign=ba62eabf3da85edffa8cfe2b795509d8/3803a651f3deb48f8a072231f91f3a292ff578e8.jpg">
