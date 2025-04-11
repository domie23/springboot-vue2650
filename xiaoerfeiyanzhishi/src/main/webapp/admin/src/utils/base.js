const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoerfeiyanzhishi/",
            name: "xiaoerfeiyanzhishi",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoerfeiyanzhishi/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "小儿肺炎知识管理系统"
        } 
    }
}
export default base
