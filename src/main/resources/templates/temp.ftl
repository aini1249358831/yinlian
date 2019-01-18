<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://cdn.bootcss.com/twitter-bootstrap/4.2.1/js/bootstrap.min.js"></script>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" action="/payWeb">
                <div class="form-group">
                    <label for="exampleInputEmail1">订单Id</label><input type="text" class="form-control" name="orderId" id="exampleInputEmail1" />
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">下单金额</label><input type="text" class="form-control" name="txnAmt" id="exampleInputPassword1" />
                </div>
                <div class="checkbox">
                    <label><input type="checkbox" />Check me out</label>
                </div> <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
    </div>
</div>


</body>
</html>