# 基础镜像使用 Java
FROM java:8
# 作者

# VOLUME 指定临时文件目录为 /tmp, 在主机 /var/lib/docker 目录下面创建临时文件并且连接容器的 /tmp
VOLUME /tmp
# 将jar包添加到容器并改名 cub.jar
ADD maven-wrapper.jar cub.jar
# 运行jar包
RUN bash -c 'touch /cub.jar']
ENTRYPOINT ["java","-jar","cub.jar"]
# 暴露6001端口作为微服务
EXPOSE 6001