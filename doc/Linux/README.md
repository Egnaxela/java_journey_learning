一、Ubuntu
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
  
  
        

