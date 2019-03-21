Linux的运行级别:   
0:系统停机状态，系统默认运行级别不能设置为0，否则不能正常启动，机器关闭。  
1:单用户工作状态，root权限，用于系统维护，禁止远程登陆，就像Windows下的安全模式登录。  
2:多用户状态，没有NFS支持。  
3:完整的多用户模式，有NFS，登陆后进入控制台命令行模式。  
4:系统未使用，保留一般不用，在一些特殊情况下可以用它来做一些事情。例如在笔记本电脑的电池用尽时，可以切换到这个模式来做一些设置。  
5:X11控制台，登陆后进入图形GUI模式，XWindow系统。  
6:系统正常关闭并重启，默认运行级别不能设为6，否则不能正常启动。运行init6机器就会重启。


##### CentOS
1、联网
	修改配置文件 vi /etc/sysconfig/network-scripts/ifcfg-eth0  或者是 ifcfg-ens33 (或改名只需将NAME改为eth0即可)
	将 ONBOOT=no 改为 ONBOOT=yes
	重启网络服务 service network restart
	
2、安装vim
	查看存在的vim相关包
	rpm -qa|grep vim
	安装
	yum -y install vim*

3、安装GNOME、KDE图形界面
	安装X窗口系统 yum groupinstall "X Window System"
	查看已安装和可安装的软件 yum grouplist
	安装图形命令 yum groupinstall "GNOME Desktop" "Graphical Administration Tools"
	
	命令：startx 进入图形界面
	更改默认运行级别：系统默认是启动命令行页面的，要默认启动图形化界面
	ln -sf /lib/systemd/system/runlevel5.target /etc/systemd/system/default.target
	
	------------------------
	查看运行级别: runlevel
	切换级别 initN 如init3进入终端模式 init5进入gui模式
	

##### Ubuntu
1、设置root密码
  sudo passwd
2、安装SSH服务及启动
  sudo apt-get install openssh-server
  sudo /etc/init.d/ssh start
  ps -e|grep ssh
3、安装vim
  sudo apt-get install vim
  vim -v
  
4、关闭防火墙 ufw disable
      开启防火墙  ufw enable   
      
5.文件权限  xxx代表文件名或文件夹 不过后面要加-ld
  sudo chmod 777 xxx (每一个都有读写执行的权限) 针对里面没有文件的文件夹
  chmod -R 0777 /tmp  //这个设置/tmp文件夹及其子文件夹的权限为0777
  
  
        

