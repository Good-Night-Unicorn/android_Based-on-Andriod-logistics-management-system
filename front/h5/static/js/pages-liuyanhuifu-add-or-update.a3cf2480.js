(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-liuyanhuifu-add-or-update"],{"1e3f":function(r,e,i){var t=i("24fb");e=t(!1),e.push([r.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-253ae590]{padding:%?20?%}.content[data-v-253ae590]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-253ae590]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-253ae590]{width:%?180?%}.avator[data-v-253ae590]{width:%?150?%;height:%?60?%}.right-input[data-v-253ae590]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-253ae590]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-253ae590]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-253ae590]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-253ae590]{border:0}.cu-form-group uni-input[data-v-253ae590]{padding:0 %?30?%}.uni-input[data-v-253ae590]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-253ae590]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-253ae590]::after{line-height:%?80?%}.select .uni-input[data-v-253ae590]{line-height:%?80?%}.input .right-input[data-v-253ae590]{line-height:%?88?%}',""]),r.exports=e},"36ab":function(r,e,i){var t=i("1e3f");"string"===typeof t&&(t=[[r.i,t,""]]),t.locals&&(r.exports=t.locals);var o=i("4f06").default;o("f3d035fa",t,!0,{sourceMap:!1,shadowMode:!1})},4778:function(r,e,i){"use strict";var t=i("36ab"),o=i.n(t);o.a},5464:function(r,e,i){"use strict";i.r(e);var t=i("5e0f"),o=i.n(t);for(var a in t)"default"!==a&&function(r){i.d(e,r,(function(){return t[r]}))}(a);e["default"]=o.a},"5e0f":function(r,e,i){"use strict";var t=i("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("a481"),i("c5f6"),i("f559"),i("ac6a"),i("96cf");var o=t(i("3b8d")),a=t(i("e2b1")),n={data:function(){return{cross:"",ruleForm:{biaoti:"",fankuihuifu:"",tupian:"",kehuzhanghao:"",kehuxingming:"",kehushouji:"",huifushijian:"",yuangonggonghao:"",yuangongxingming:"",userid:""},user:{},ro:{biaoti:!1,fankuihuifu:!1,tupian:!1,kehuzhanghao:!1,kehuxingming:!1,kehushouji:!1,huifushijian:!1,yuangonggonghao:!1,yuangongxingming:!1,userid:!1}}},components:{wPicker:a.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var r=(0,o.default)(regeneratorRuntime.mark((function r(e){var i,t,o,a;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return this.ruleForm.huifushijian=this.$utils.getCurDate(),i=uni.getStorageSync("nowTable"),r.next=4,this.$api.session(i);case 4:if(t=r.sent,this.user=t.data,this.ruleForm.yuangonggonghao=this.user.yuangonggonghao,this.ro.yuangonggonghao=!0,this.ruleForm.yuangongxingming=this.user.yuangongxingming,this.ro.yuangongxingming=!0,this.ruleForm.userid=uni.getStorageSync("userid"),e.refid&&(this.ruleForm.refid=e.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!e.id){r.next=18;break}return this.ruleForm.id=e.id,r.next=16,this.$api.info("liuyanhuifu",this.ruleForm.id);case 16:t=r.sent,this.ruleForm=t.data;case 18:if(this.cross=e.cross,!e.cross){r.next=66;break}o=uni.getStorageSync("crossObj"),r.t0=regeneratorRuntime.keys(o);case 22:if((r.t1=r.t0()).done){r.next=66;break}if(a=r.t1.value,"biaoti"!=a){r.next=28;break}return this.ruleForm.biaoti=o[a],this.ro.biaoti=!0,r.abrupt("continue",22);case 28:if("fankuihuifu"!=a){r.next=32;break}return this.ruleForm.fankuihuifu=o[a],this.ro.fankuihuifu=!0,r.abrupt("continue",22);case 32:if("tupian"!=a){r.next=36;break}return this.ruleForm.tupian=o[a],this.ro.tupian=!0,r.abrupt("continue",22);case 36:if("kehuzhanghao"!=a){r.next=40;break}return this.ruleForm.kehuzhanghao=o[a],this.ro.kehuzhanghao=!0,r.abrupt("continue",22);case 40:if("kehuxingming"!=a){r.next=44;break}return this.ruleForm.kehuxingming=o[a],this.ro.kehuxingming=!0,r.abrupt("continue",22);case 44:if("kehushouji"!=a){r.next=48;break}return this.ruleForm.kehushouji=o[a],this.ro.kehushouji=!0,r.abrupt("continue",22);case 48:if("huifushijian"!=a){r.next=52;break}return this.ruleForm.huifushijian=o[a],this.ro.huifushijian=!0,r.abrupt("continue",22);case 52:if("yuangonggonghao"!=a){r.next=56;break}return this.ruleForm.yuangonggonghao=o[a],this.ro.yuangonggonghao=!0,r.abrupt("continue",22);case 56:if("yuangongxingming"!=a){r.next=60;break}return this.ruleForm.yuangongxingming=o[a],this.ro.yuangongxingming=!0,r.abrupt("continue",22);case 60:if("userid"!=a){r.next=64;break}return this.ruleForm.userid=o[a],this.ro.userid=!0,r.abrupt("continue",22);case 64:r.next=22;break;case 66:this.styleChange();case 67:case"end":return r.stop()}}),r,this)})));function e(e){return r.apply(this,arguments)}return e}(),methods:{styleChange:function(){this.$nextTick((function(){}))},huifushijianChange:function(r){this.ruleForm.huifushijian=r.target.value,this.$forceUpdate()},tupianTap:function(){var r=this;this.$api.upload((function(e){r.ruleForm.tupian="upload/"+e.file,r.$forceUpdate(),r.$nextTick((function(){r.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var r=(0,o.default)(regeneratorRuntime.mark((function r(){var e,i,t,o,a,n,u,d,s,l;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(this.ruleForm.biaoti){r.next=3;break}return this.$utils.msg("标题不能为空"),r.abrupt("return");case 3:if(this.ruleForm.fankuihuifu){r.next=6;break}return this.$utils.msg("反馈回复不能为空"),r.abrupt("return");case 6:if(this.ruleForm.tupian){r.next=9;break}return this.$utils.msg("图片不能为空"),r.abrupt("return");case 9:if(!this.cross){r.next=25;break}if(o=uni.getStorageSync("statusColumnName"),a=uni.getStorageSync("statusColumnValue"),""==o){r.next=25;break}if(n=uni.getStorageSync("crossObj"),o.startsWith("[")){r.next=21;break}for(u in n)u==o&&(n[u]=a);return d=uni.getStorageSync("crossTable"),r.next=19,this.$api.update("".concat(d),n);case 19:r.next=25;break;case 21:e=Number(uni.getStorageSync("userid")),i=n["id"],t=uni.getStorageSync("statusColumnName"),t=t.replace(/\[/,"").replace(/\]/,"");case 25:if(!i||!e){r.next=47;break}return this.ruleForm.crossuserid=e,this.ruleForm.crossrefid=i,s={page:1,limit:10,crossuserid:e,crossrefid:i},r.next=31,this.$api.list("liuyanhuifu",s);case 31:if(l=r.sent,!(l.data.total>=t)){r.next=37;break}return this.$utils.msg(uni.getStorageSync("tips")),r.abrupt("return",!1);case 37:if(!this.ruleForm.id){r.next=42;break}return r.next=40,this.$api.update("liuyanhuifu",this.ruleForm);case 40:r.next=44;break;case 42:return r.next=44,this.$api.add("liuyanhuifu",this.ruleForm);case 44:this.$utils.msgBack("提交成功");case 45:r.next=55;break;case 47:if(!this.ruleForm.id){r.next=52;break}return r.next=50,this.$api.update("liuyanhuifu",this.ruleForm);case 50:r.next=54;break;case 52:return r.next=54,this.$api.add("liuyanhuifu",this.ruleForm);case 54:this.$utils.msgBack("提交成功");case 55:case"end":return r.stop()}}),r,this)})));function e(){return r.apply(this,arguments)}return e}(),optionsChange:function(r){this.index=r.target.value},bindDateChange:function(r){this.date=r.target.value},getDate:function(r){var e=new Date,i=e.getFullYear(),t=e.getMonth()+1,o=e.getDate();return"start"===r?i-=60:"end"===r&&(i+=2),t=t>9?t:"0"+t,o=o>9?o:"0"+o,"".concat(i,"-").concat(t,"-").concat(o)},toggleTab:function(r){this.$refs[r].show()}}};e.default=n},b352:function(r,e,i){"use strict";i.r(e);var t=i("b62b"),o=i("5464");for(var a in o)"default"!==a&&function(r){i.d(e,r,(function(){return o[r]}))}(a);i("4778");var n,u=i("f0c5"),d=Object(u["a"])(o["default"],t["b"],t["c"],!1,null,"253ae590",null,!1,t["a"],n);e["default"]=d.exports},b62b:function(r,e,i){"use strict";var t,o=function(){var r=this,e=r.$createElement,i=r._self._c||e;return i("v-uni-view",{staticClass:"content"},[i("v-uni-form",{staticClass:"app-update-pv"},[i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0.25)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("标题")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(0,0,0,.6)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"16rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:r.ro.biaoti,placeholder:"标题"},model:{value:r.ruleForm.biaoti,callback:function(e){r.$set(r.ruleForm,"biaoti",e)},expression:"ruleForm.biaoti"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"rgba(65, 65, 65, 1)",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0 0 4rpx",width:"100%",borderStyle:"solid",height:"108rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.tupianTap.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("图片")]),i("v-uni-view",{staticClass:"right-input",staticStyle:{padding:"0"}},[r.ruleForm.tupian?i("v-uni-image",{staticClass:"avator",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",borderRadius:"100%",borderWidth:"4rpx",width:"88rpx",borderStyle:"solid",height:"88rpx"},attrs:{src:r.baseUrl+r.ruleForm.tupian,mode:"aspectFill"}}):i("v-uni-image",{staticClass:"avator",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",borderRadius:"100%",borderWidth:"4rpx",width:"88rpx",borderStyle:"solid",height:"88rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1)],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0.25)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("客户账号")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(0,0,0,.6)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"16rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:r.ro.kehuzhanghao,placeholder:"客户账号"},model:{value:r.ruleForm.kehuzhanghao,callback:function(e){r.$set(r.ruleForm,"kehuzhanghao",e)},expression:"ruleForm.kehuzhanghao"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0.25)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("客户姓名")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(0,0,0,.6)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"16rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:r.ro.kehuxingming,placeholder:"客户姓名"},model:{value:r.ruleForm.kehuxingming,callback:function(e){r.$set(r.ruleForm,"kehuxingming",e)},expression:"ruleForm.kehuxingming"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0.25)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("客户手机")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(0,0,0,.6)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"16rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:r.ro.kehushouji,placeholder:"客户手机"},model:{value:r.ruleForm.kehushouji,callback:function(e){r.$set(r.ruleForm,"kehushouji",e)},expression:"ruleForm.kehushouji"}})],1),i("v-uni-view",{staticClass:"cu-form-group select",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("回复时间")]),i("v-uni-picker",{attrs:{mode:"date",value:r.ruleForm.huifushijian},on:{change:function(e){arguments[0]=e=r.$handleEvent(e),r.huifushijianChange.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"uni-input",style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"16rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v(r._s(r.ruleForm.huifushijian?r.ruleForm.huifushijian:"请选择回复时间"))])],1)],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0.25)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("员工工号")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(0,0,0,.6)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"16rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:r.ro.yuangonggonghao,placeholder:"员工工号"},model:{value:r.ruleForm.yuangonggonghao,callback:function(e){r.$set(r.ruleForm,"yuangonggonghao",e)},expression:"ruleForm.yuangonggonghao"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0.25)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("员工姓名")]),i("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(0,0,0,.6)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"16rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:r.ro.yuangongxingming,placeholder:"员工姓名"},model:{value:r.ruleForm.yuangongxingming,callback:function(e){r.$set(r.ruleForm,"yuangongxingming",e)},expression:"ruleForm.yuangongxingming"}})],1),i("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"308rpx"}},[i("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v("反馈回复")]),i("v-uni-textarea",{style:{padding:"20rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(0,0,0,.6)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"280rpx"},attrs:{placeholder:"反馈回复"},model:{value:r.ruleForm.fankuihuifu,callback:function(e){r.$set(r.ruleForm,"fankuihuifu",e)},expression:"ruleForm.fankuihuifu"}})],1),i("v-uni-view",{staticClass:"btn"},[i("v-uni-button",{staticClass:"bg-red",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0) inset",margin:"0",backgroundColor:"rgba(209, 176, 134, 1)",borderColor:"rgba(209, 176, 134, 1)",borderRadius:"80rpx",color:"#fff",borderWidth:"0",width:"320rpx",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},on:{click:function(e){arguments[0]=e=r.$handleEvent(e),r.onSubmitTap.apply(void 0,arguments)}}},[r._v("提交")])],1)],1)],1)},a=[];i.d(e,"b",(function(){return o})),i.d(e,"c",(function(){return a})),i.d(e,"a",(function(){return t}))}}]);