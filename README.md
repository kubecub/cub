# cub

<a href="https://trackgit.com">
<img src="https://us-central1-trackgit-analytics.cloudfunctions.net/token/ping/la3d7e2jmpn7lsfgfcla" alt="trackgit-views" />
</a>


## module

+ `code block`：[./cub/README.md](./cub/README.md)
+ `PATH` ：[./jdk1.8/](./jdk1.8/)
+ The `cub` script is automatically pushed to `git` ：[./gitsync.sh](./gitsync.sh)



##  contribution

> fork the repository to your local

**clone：**

```bash
git clone https://github.com/c-ub/cub.git 
```



**add origin：**

```bash
cd cub
```



**You need to update frequently：**

```bash
git pull origin main 
```



**branch？main :  master**

+ `main`：The main propulsion module
+ `master`：Test module, last year's record, no javaspring



**push？**

1. The normal way

   ```
   git add .
   git commit -s -m "You-commits"
   git push origin main
   ```

   

2. You can choose the script （💡 recommendations）

   ```bash
   gitsync.sh You-commits
   ```

   > You need an sh environment and just run it
   >
   > ![image-20221104192425085](http://sm.nsddd.top/smimage-20221104192425085.png)



**MySQL**

<details><summary><b>⚡ 导入sql</b></summary>

<b>数据库名称：create 数据库编码 utf8mb4</b>

<pre><code>
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ps
-- ----------------------------
DROP TABLE IF EXISTS `ps`;
CREATE TABLE `ps`  (
  `paddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学校校长的账户地址',
  `saddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学校的智能合约地址',
  PRIMARY KEY (`paddress`, `saddress`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ps

-- ----------------------------
INSERT INTO `ps` VALUES ('0x7Fa0CD079dFe44F3659b1A0fB4ad3c22aae8280F', '0x63F988E17982C155a1Ff96c6490Ac00dA411CCb2');

-- ----------------------------
-- Table structure for sc
-- ----------------------------
DROP TABLE IF EXISTS `sc`;
CREATE TABLE `sc`  (
  `saddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学生账号的地址',
  `caddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学生对应合约账号的地址',
  PRIMARY KEY (`saddress`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sc
-- ----------------------------
INSERT INTO `sc` VALUES ('0xc2a7324d5340aF9dB8de298Cf3f96295B24ca988', '0x958CE095AC459485Ed26a38fd904F011979643D0');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `snumber` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学号',
  `sname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sex` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '性别',
  `mail` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`snumber`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tc
-- ----------------------------
DROP TABLE IF EXISTS `tc`;
CREATE TABLE `tc`  (
  `taddress` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '教师的区块链节点地址',
  `caddress` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '教师对应的智能合约的区块链地址',
  PRIMARY KEY (`taddress`, `caddress`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `account` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学号或者工号',
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `identify` int(11) NULL DEFAULT NULL COMMENT '身份信息（0代表学生，1代表老师，2代表管理员）',
  `uName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `mail` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`account`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2016014302', '19970329', 0, '谦谦君', '2016014302@mail.buct.edu.cn');

SET FOREIGN_KEY_CHECKS = 1;

</pre></code>

</details>

<br>
