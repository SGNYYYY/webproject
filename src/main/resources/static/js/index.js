// 用户年龄占比
(function() {
  // 实例化对象
  var chartDom = document.getElementById('bar-age');
  var myChart = echarts.init(chartDom);
  $.getJSON("./queryUserAge",function(values){
    var xAxis = []
    var yAxis = []
    var zAxis = []
    var totalNum = 0
    console.log(values.data)
    for(var i=0;i<values.data.length;i++){
      totalNum += values.data[i]["num"]
    }
    var over50 = 0
    for(var i=0;i<values.data.length;i++){
      if(values.data[i]["age_range"] === "0") {
        xAxis.push("未知")
        yAxis.push(((values.data[i]["num"]/totalNum)*100).toFixed(2))
        zAxis.push(values.data[i]["num"])
      }else if(values.data[i]["age_range"] === "1"){
        xAxis.push("<18")
        yAxis.push(((values.data[i]["num"]/totalNum)*100).toFixed(2))
        zAxis.push(values.data[i]["num"])
      }else if(values.data[i]["age_range"] === "2"){
        xAxis.push("18-24")
        yAxis.push(((values.data[i]["num"]/totalNum)*100).toFixed(2))
        zAxis.push(values.data[i]["num"])
      }else if(values.data[i]["age_range"] === "3"){
        xAxis.push("25-29")
        yAxis.push(((values.data[i]["num"]/totalNum)*100).toFixed(2))
        zAxis.push(values.data[i]["num"])
      }else if(values.data[i]["age_range"] === "4"){
        xAxis.push("30-34")
        yAxis.push(((values.data[i]["num"]/totalNum)*100).toFixed(2))
        zAxis.push(values.data[i]["num"])
      }else if(values.data[i]["age_range"] === "5"){
        xAxis.push("35-39")
        yAxis.push(((values.data[i]["num"]/totalNum)*100).toFixed(2))
        zAxis.push(values.data[i]["num"])
      }else if(values.data[i]["age_range"] === "6"){
        xAxis.push("40-49")
        yAxis.push(((values.data[i]["num"]/totalNum)*100).toFixed(2))
        zAxis.push(values.data[i]["num"])
      }else{
        over50 += values.data[i]["num"]
      }
    }
    xAxis.push(">50")
    yAxis.push(((over50/totalNum)*100).toFixed(2))
    zAxis.push(over50)
    option = {
      color: ["#2f89cf"],
      tooltip : {
        trigger: 'axis',
        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
          type : 'shadow',        // 默认为直线，可选为：'line' | 'shadow'
        },
        formatter: '{c}%'
      },
      grid: {
            left: "0%",
            top: "8px",
            right: "0%",
            bottom: "6%",
            containLabel: true
      },
      xAxis: {
        type: 'category',
        data: xAxis,
        name: '年龄段',
        axisTick: {
          alignWithLabel: true
        },
        axisLabel: {
          textStyle: {
            color: "rgba(255,255,255,.6)",
            fontSize: "9"
          }
        },
        axisLine: {
          show: false
        },
        nameLocation:'middle',
        nameTextStyle:{
          color:"rgba(255,255,255,.6)",
          fontSize: 8,
        }
      },
      yAxis: {
        type: 'value',
        axisLabel: {
          show: true,
          interval: 'auto',
          formatter: '{value} %',
          textStyle: {
            color: "rgba(255,255,255,.6)",
            fontSize: "12"
          }
        },
        show: true,
        name: '占比',
              axisLine: {
                lineStyle: {
                  color: "rgba(255,255,255,.1)"
                  // width: 1,
                  // type: "solid"
                }
              },
              splitLine: {
                lineStyle: {
                  color: "rgba(255,255,255,.1)"
                }
              }
      },
      series: [
        {
          name: '用户',
          emphasis: {
            label: {
              show: true,
              fontSize: '40',
              fontWeight: 'bold'
            }
          },
          data: yAxis,
          type: 'bar',
          barWidth: "35%",
          itemStyle: {
            barBorderRadius: 5,
            normal: {
              label: {
                show: true, //开启显示
                position: 'top', //在上方显示
                formatter:'{c}%',
                color: "rgba(255,255,255,.6)"
              },
            }
          },
        }
      ]
    };
    option && myChart.setOption(option);
    window.addEventListener("resize", function() {
      myChart.resize();
    });
  })
})();

// 购买数Top10用户行为
(function() {
  // 基于准备好的dom，初始化echarts实例
  var chartDom = document.getElementById("line-userAction");
  var myChart = echarts.init(chartDom);
  $.getJSON("./queryUserActionTop5",function(values){
    var totalLogs = []
    var oneClicksTimes = []
    var shoppingCartsTimes = []
    var purchaseTimes = []
    var favouriteTimes = []
    var userId = []
    for(var i=0;i<values.data.length;i++){
      var useri = [];
      totalLogs.push(values.data[i].totalLogs)
      oneClicksTimes.push(values.data[i].oneClicksTimes)
      shoppingCartsTimes.push(values.data[i].shoppingCartsTimes)
      purchaseTimes.push(values.data[i].purchaseTimes)
      favouriteTimes.push(values.data[i].favouriteTimes)
      userId.push(values.data[i].userId)
    }
    option = {
      color: ["#00f2f1", "#ed3f35", "#00ff6d", "#ff9ede"],
      legend: {
        // 距离容器10%
        right: "10%",
        // 修饰图例文字的颜色
        textStyle: {
          color: "#4c9bfd"
        }
      },
      tooltip: {
        trigger: "axis"
      },
      grid: {
        top: "20%",
        left: "3%",
        right: "4%",
        bottom: "3%",
        show: true,
        borderColor: "#012f4a",
        containLabel: true
      },
      xAxis: {

        type: 'category' ,
        name: '用户id',
        data: userId,
        boundaryGap: false,
        // 去除刻度
        axisTick: {
          show: false
        },
        // 修饰刻度标签的颜色
        axisLabel: {
          color: "rgba(255,255,255,.7)",
          textStyle: {
            fontSize: "9"
          }
        },
        // 去除x坐标轴的颜色
        axisLine: {
          show: false
        },
        nameLocation:'middle',
        nameTextStyle:{
          color:"rgba(255,255,255,.6)",
          fontSize: 7,
        }
      },
      yAxis: {
        type: "value",
        // 去除刻度
        axisTick: {
          show: false
        },
        // 修饰刻度标签的颜色
        axisLabel: {
          color: "rgba(255,255,255,.7)"
        },
        // 修改y轴分割线的颜色
        splitLine: {
          lineStyle: {
            color: "#012f4a"
          }
        }
      },
      // Declare several bar series, each will be mapped
      // to a column of dataset.source by default.
      series: [
        {
          name: "单击",
          type: "line",
          stack: "总量",
          // 是否让线条圆滑显示
          smooth: true,
          data: oneClicksTimes
        },
        {
          name: "加入购物车",
          type: "line",
          stack: "总量",
          // 是否让线条圆滑显示
          smooth: true,
          data: shoppingCartsTimes
        },
        {
          name: "购买",
          type: "line",
          stack: "总量",
          // 是否让线条圆滑显示
          smooth: true,
          data: purchaseTimes
        },
        {
          name: "收藏",
          type: "line",
          stack: "总量",
          // 是否让线条圆滑显示
          smooth: true,
          data: favouriteTimes
        },
      ]
    };
    option && myChart.setOption(option);
  })
  window.addEventListener("resize", function() {
    myChart.resize();
  });
})();

// 用户行为分布
(function() {
  // 基于准备好的dom，初始化echarts实例
  var chartDom = document.getElementById('pie-action');
  var myChart= echarts.init(chartDom);
  $.getJSON("./queryUserAction",function(values){
    var bufData = []
    console.log(values.data)
    for(var i=0;i<values.data.length;i++){
      var jsonData ={}
      jsonData.value = values.data[i].purchaseTimes
      jsonData.name = "购买"
      bufData.push(jsonData)
      jsonData ={}
      jsonData.value = values.data[i].favouriteTimes
      jsonData.name = "收藏"
      bufData.push(jsonData)
      jsonData ={}
      jsonData.value = values.data[i].oneClicksTimes
      jsonData.name = "点击"
      bufData.push(jsonData)
      jsonData ={}
      jsonData.value = values.data[i].shoppingCartsTimes
      jsonData.name = "加入购物车"
      bufData.push(jsonData)
    }
    option = {
      color: ['#c23531','#2f4554', '#61a0a8'],
        tooltip: {
          trigger: "item",
          formatter: "{a} <br/>{b}: {c} ({d}%)",
          position: function(p) {
            //其中p为当前鼠标的位置
            return [p[0] + 10, p[1] - 10];
          }
        },
      legend: {
        top: "90%",
        left: 'center',
            textStyle: {
              color: "rgba(255,255,255,.5)",
              fontSize: "12"
            },
            itemWidth: 10,
            itemHeight: 10,
      },
      series: [
        {
          name: '行为',
          type: 'pie',
          color: [
              "#065aab",
              "#00e0ff",
              "#8cffdc",
              "#6efd9a"
          ],
          radius: ['40%', '60%'],
          avoidLabelOverlap: false,
          label: {
            show: false,
            position: 'center'
          },
          emphasis: {
            label: {
              show: true,
              fontSize: '40',
              fontWeight: 'bold'
            }
          },
          labelLine: {
            show: false
          },
          data: bufData
        }
      ]
    };
    option && myChart.setOption(option);

  })
  window.addEventListener("resize", function() {
    myChart.resize();
  });
})();

(function() {
  // 基于准备好的dom，初始化echarts实例
  var chartDom = document.getElementById('pie-gender');
  var myChart = echarts.init(chartDom);
  $.getJSON("./queryUserGender",function(values){
    var bufData = []
    for(var i=0;i<values.data.length;i++){
      var jsonData ={}
      jsonData.value = values.data[i]['num']
      var gender = values.data[i]['gender']
      if(gender === "1"){
        jsonData.name = "男"
      }else if(gender === "0"){
        jsonData.name = "女"
      }else{
        jsonData.name = "未知"
      }

      bufData.push(jsonData)
    }
    option = {
      color:['#f88888','#0059f6','#b6ffb3'],
      tooltip: {
        trigger: 'item'
      },
      legend: {
        orient: 'vertical',
        left: 'left',
        textStyle:{
          color:'#fff'
        }
      },
      series: [
        {
          name: '人数',
          type: 'pie',
          radius: '50%',
          data: bufData,
          emphasis: {
            itemStyle: {
              shadowBlur: 10,
              shadowOffsetX: 0,
              shadowColor: 'rgba(0, 0, 0, 0.5)'
            }
          }
        }
      ]
    };

    option && myChart.setOption(option);

  })
  window.addEventListener("resize", function() {
    myChart.resize();
  });
})();

//销量Top10商家交互操作
(function() {
  // 基于准备好的dom，初始化echarts实例
  var chartDom = document.getElementById('bar-action');
  var myChart = echarts.init(chartDom);
  $.getJSON("./querySellerAction",function(values){
    var merchantId = []
    var totalLogs = []
    var oneClicksTimes = []
    var shoppingCartsTimes = []
    var purchaseTimes = []
    var favouriteTimes = []
    for(var i=0;i<values.data.length;i++){
      merchantId.push(values.data[i].merchantId)
      totalLogs.push(values.data[i].totalLogs)
      oneClicksTimes.push(values.data[i].oneClicksTimes)
      shoppingCartsTimes.push(values.data[i].shoppingCartsTimes)
      purchaseTimes.push(values.data[i].purchaseTimes)
      favouriteTimes.push(values.data[i].favouriteTimes)
    }
    option = {
      legend: {
        textStyle: {
          color: "rgba(255,255,255,.5)",
          fontSize: "12"
        }
      },
      tooltip: {
        trigger: 'axis',
        axisPointer: {
          // Use axis to trigger tooltip
          type: 'shadow' // 'shadow' as default; can also be 'line' or 'shadow'
        }
      },
      grid: {
        left: '3%',
        right: '4%',
        bottom: '6%',
        containLabel: true
      },
      xAxis: {
        type: 'value' ,
        name: '人次',
        axisLabel: {
          textStyle: {
            color: "rgba(255,255,255,.6)",
            fontSize: "8"
          }
        },
        nameLocation:'middle',
        nameTextStyle:{
          color:"rgba(255,255,255,.6)",
          fontSize: 10,
        }
      },
      yAxis: {
        name: '商家id',
        type: 'category',
        data: merchantId,
        axisLabel: {
          textStyle: {
            color: "rgba(255,255,255,.6)",
            fontSize: "8"
          }
        },
        nameTextStyle:{
          color:"rgba(255,255,255,.6)",
          fontSize: 9,
        }
      },
      // Declare several bar series, each will be mapped
      // to a column of dataset.source by default.
      series: [
        {
          name: '单击',
          type: 'bar',
          stack: 'total',
          // label: {
          //   show: true
          // },
          emphasis: {
            focus: 'series'
          },
          data: oneClicksTimes
        },
        {
          name: '加入购物车',
          type: 'bar',
          stack: 'total',
          // label: {
          //   show: true
          // },
          emphasis: {
            focus: 'series'
          },
          data: shoppingCartsTimes
        },
        {
          name: '购买',
          type: 'bar',
          stack: 'total',
          // label: {
          //   show: true
          // },
          emphasis: {
            focus: 'series'
          },
          data: purchaseTimes
        },
        {
          name: '收藏',
          type: 'bar',
          stack: 'total',
          // label: {
          //   show: true
          // },
          emphasis: {
            focus: 'series'
          },
          data: favouriteTimes
        }
      ]
    };
    option && myChart.setOption(option);
  })
  window.addEventListener("resize", function() {
    myChart.resize();
  });
})();

// 销量Top10商家复购情况
(function() {
  // 基于准备好的dom，初始化echarts实例
  var chartDom = document.getElementById('bar-sellerLabel');
  var myChart = echarts.init(chartDom);
  $.getJSON("./querySellerTop10Label",function(values){
    var label0 = []
    var label1 = []
    var merchantId = []
    for(var i=0;i<values.data.length;i++){
      merchantId.push(values.data[i]["merchantId"])
      label0.push(values.data[i]["label0"])
      label1.push(values.data[i]["label1"])
    }
    option = {
      color: ["#2f89cf","#ff7c7c"],
      legend: {
        textStyle: {
          color: "rgba(255,255,255,.5)",
          fontSize: "12"
        }
      },
      tooltip: {
        trigger: 'axis',
        axisPointer: {
          // Use axis to trigger tooltip
          type: 'shadow' // 'shadow' as default; can also be 'line' or 'shadow'
        },
      },
      grid: {
        left: '3%',
        right: '4%',
        bottom: '6%',
        containLabel: true
      },
      xAxis: {
        type: 'category' ,
        name: '商家id',
        data: merchantId,
        axisLabel: {
          textStyle: {
            color: "rgba(255,255,255,.6)",
            fontSize: "8"
          }
        },
        nameLocation:'middle',
        nameTextStyle:{
          color:"rgba(255,255,255,.6)",
          fontSize: 10,
        }
      },
      yAxis: {
        name: '人次',
        type: 'value',
        axisLabel: {
          textStyle: {
            color: "rgba(255,255,255,.6)",
            fontSize: "8"
          }
        },
        nameTextStyle:{
          color:"rgba(255,255,255,.6)",
          fontSize: 10,
        }
      },
      // Declare several bar series, each will be mapped
      // to a column of dataset.source by default.
      series: [
        {
          name: '未复购',
          type: 'bar',
          emphasis: {
            focus: 'series'
          },
          data: label0
        },
        {
          name: '复购',
          type: 'bar',
          // label: {
          //   show: true
          // },
          emphasis: {
            focus: 'series'
          },
          data: label1
        }
      ]
    };
    option && myChart.setOption(option);
  })
  window.addEventListener("resize", function() {
    myChart.resize();
  });
})();
