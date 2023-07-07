# lfc-mybatis-series

mybatis 学习

## 各子项目 pom.xml 配置

### 指定所属 parent

```xml
	<!-- 指定所属parent-->
	<parent>
		<artifactId>lfc-mybatis-series</artifactId>
		<groupId>lfc.mybatis.series</groupId>
		<version>1.0</version>
	</parent>
```

### 指定编译版本号

```xml
 <!-- 指定maven.compiler.source和maven.compiler.target-->
  <properties>
	<maven.compiler.source>20</maven.compiler.source>
	<maven.compiler.target>20</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>
```

### lombok 支持 version 要指定具体的版本

```xml
		<!-- lombok支持version要指定具体的版本-->
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.18.28</version>
    		<scope>provided</scope>
		</dependency>
```

### build

```xml
	<build>
	<plugins>
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-compiler-plugin</artifactId>
			 <version>3.11.0</version>
			<configuration>
				<annotationProcessorPaths>
					<path>
						<groupId>org.projectlombok</groupId>
						<artifactId>lombok</artifactId>
						<version>1.18.28</version>
					</path>
			</annotationProcessorPaths>
			</configuration>
		</plugin>

		</plugins>
	</build>
```
