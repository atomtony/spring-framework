# 项目根目录
PROJECT_ROOT=/home/jht/github/spring-framework
# 项目发布目录
DISTRIBUTION_ROOT=/home/jht/github/spring-framework/out/artifacts/spring_SpringMVCDemoNoWebXML_Web_exploded
# 项目发布模块名称
MODEL_NAME=SpringMVCDemoNoWebXML

# 拷贝依赖库文件
mkdir -p ${DISTRIBUTION_ROOT}/WEB-INF/lib/
cp ${PROJECT_ROOT}/spring-beans/build/libs/spring-beans-5.0.18.BUILD-SNAPSHOT.jar ${DISTRIBUTION_ROOT}/WEB-INF/lib/
cp ${PROJECT_ROOT}/spring-aop/build/libs/spring-aop-5.0.18.BUILD-SNAPSHOT.jar ${DISTRIBUTION_ROOT}/WEB-INF/lib/
cp ${PROJECT_ROOT}/spring-context/build/libs/spring-context-5.0.18.BUILD-SNAPSHOT.jar ${DISTRIBUTION_ROOT}/WEB-INF/lib/
cp ${PROJECT_ROOT}/spring-core/build/libs/spring-core-5.0.18.BUILD-SNAPSHOT.jar ${DISTRIBUTION_ROOT}/WEB-INF/lib/
cp ${PROJECT_ROOT}/spring-expression/build/libs/spring-expression-5.0.18.BUILD-SNAPSHOT.jar ${DISTRIBUTION_ROOT}/WEB-INF/lib/
cp ${PROJECT_ROOT}/spring-jcl/build/libs/spring-jcl-5.0.18.BUILD-SNAPSHOT.jar ${DISTRIBUTION_ROOT}/WEB-INF/lib/
cp ${PROJECT_ROOT}/spring-web/build/libs/spring-web-5.0.18.BUILD-SNAPSHOT.jar ${DISTRIBUTION_ROOT}/WEB-INF/lib/
cp ${PROJECT_ROOT}/spring-webmvc/build/libs/spring-webmvc-5.0.18.BUILD-SNAPSHOT.jar ${DISTRIBUTION_ROOT}/WEB-INF/lib/

# 拷贝编译文件
mkdir -p ${DISTRIBUTION_ROOT}/WEB-INF/classes
cp -r ${PROJECT_ROOT}/${MODEL_NAME}/build/classes/java/main/* ${DISTRIBUTION_ROOT}/WEB-INF/classes

# 拷贝资源文件
cp -r ${PROJECT_ROOT}/${MODEL_NAME}/build/resources/main/* ${DISTRIBUTION_ROOT}/WEB-INF/classes
