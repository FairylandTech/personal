# Linux

## CentOS 系列操作系统

### 本地yum源的配置(FTP)

1. 安装vsftpd

```shell
yum install -y vsftpd

```

2. 启动vsftpd

```shell
# 设置开机启动
systemctl enable vsftpd
# 启动
systemctl start vsftpd

```

3. 上传镜像
4. 配置yum仓库

```shell
mkdir -p /var/ftp/centos7 /var/ftp/centos8.1
cat >/etc/yum.repos.d/ftp_7.repo << EOF
name = ftpbase
baseurl = ftp://[localhost]/centos7
enabled = 1
gpgcheck = 0
EOF
cat >/etc/yum.repos.d/ftp_8.1.repo << EOF
name = ftpbase
baseurl = ftp://[localhost]/centos8.1
enabled = 1
gpgcheck = 0
EOF

```

5. 挂载镜像

```shell
mount -o loop /mnt/[镜像名字] /var/ftp/centos7
*loop 已只读方式挂载
```

