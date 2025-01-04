const base = {
    get() {
        return {
            url : "http://localhost:8080/ssms772z/",
            name: "ssms772z",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssms772z/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "物流管理系统"
        } 
    }
}
export default base
