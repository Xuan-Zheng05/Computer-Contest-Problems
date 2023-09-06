<!DOCTYPE html>
<html lang="en">
<head>
<title>Submission of TLE &#39;16 Contest 4 P4 - Christmas Tree Building by bruce - DMOJ: Modern Online Judge</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="keywords" content="DMOJ,Canadian,online judge,programming,code,contest,CCC,CCC Solutions,CCC 2015,CCO,IOI,JOI,COCI,DMOPC,Canada,Ontario,Toronto,grade,interactive">
<meta id="viewport" name="viewport" content="width=device-width, initial-scale=1">

<link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60" href="/apple-touch-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76" href="/apple-touch-icon-76x76.png">
<link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120" href="/apple-touch-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152" href="/apple-touch-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180" href="/apple-touch-icon-180x180.png">
<link rel="icon" type="image/png" href="/favicon-32x32.png" sizes="32x32">
<link rel="icon" type="image/png" href="/android-chrome-192x192.png" sizes="192x192">
<link rel="icon" type="image/png" href="/favicon-96x96.png" sizes="96x96">
<link rel="icon" type="image/png" href="/favicon-16x16.png" sizes="16x16">
<link rel="manifest" href="/manifest.json">
<meta name="msapplication-TileColor" content="#FFBB33">
<meta name="msapplication-TileImage" content="/mstile-144x144.png">
<meta name="theme-color" content="#FFBB33">
<meta property="og:site_name" content="DMOJ: Modern Online Judge">
<meta property="og:url" content="https://dmoj.ca/submission/4575177">
<!--[if lt IE 9]>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script>window.bad_browser = true</script>
    <![endif]-->
<link rel="stylesheet" href="https://static.dmoj.ca/static/cache/css/output.ac4bf8aad984.css" type="text/css"> <link rel="canonical" href="https://dmoj.ca/submission/4575177">
<script src="https://static.dmoj.ca/static/cache/js/output.ace4769b24e3.js"></script> <script type="text/javascript" src="https://static.dmoj.ca/static/event.fc1d5dd8e82a.js"></script>
<script>
            window.user = {
                email: 'xiaomingnan@gmail.com',
                id: '281',
                name: 'bruce'
            };
        </script>
<script>window.user && Raven.setUserContext(window.user)</script>
<script>
    (function(d,m,o,j){d[o]=j;d[j]=d[j]||function(){(d[j].q=d[j].q||[]).push(arguments)},d[j].l=1*new Date()})(window,document,'GoogleAnalyticsObject','ga');
    ga('create', 'UA-56757436-1', 'auto');
    ga('require', 'displayfeatures');
    ga('send', 'pageview');
</script>
<script src="https://llandudno.algome.me/*(d3d3Lmdvb2dsZS1hbmFseXRpY3MuY29t)*/*(YW5hbHl0aWNzLmpz)*" async></script>
<noscript>
        <style>
            #content {
                margin: 80px auto auto;
            }

            #navigation {
                top: 27px;
            }
        </style>
    </noscript>
</head>
<body>
<svg width="0" height="0" style="display: block">
<defs>
<clipPath id="rating-clip"><circle cx="8" cy="8" r="7" /></clipPath>
</defs>
</svg>
<nav id="navigation" class="unselectable">
<div id="nav-container">
<a id="navicon" href="javascript:void(0)"><i class="fa fa-bars"></i></a>
<ul id="nav-list">
<li class="home-nav-element"><a href="/"> <img src="https://static.dmoj.ca/static/icons/logo.021be82ad4a6.svg" alt="DMOJ" width="160" height="44" onerror="this.src=&quot;https://static.dmoj.ca/static/icons/logo.6ced6e9f0399.png&quot;; this.onerror=null" style="border: none">
</a></li>
<li class="home-nav-element"><span class="nav-divider"></span></li>
<li class="home-menu-item"><a href="/" class="nav-home">Home</a></li>
<li>
<a href="/problems/" class="nav-problem">
Problems
</a>
</li>
<li>
<a href="/submissions/" class="nav-submit active">
Submissions
</a>
</li>
<li>
<a href="/users/" class="nav-user">
Users
</a>
</li>
<li>
<a href="/contests/" class="nav-contest">
Contests
</a>
</li>
<li>
<a href="/about/" class="nav-about">
About
</a>
<ul> <li>
<a href="/status/" class="nav-status">
Status
</a>
</li>
<li>
<a href="/tips/" class="nav-tips">
Tips
</a>
</li>
<li>
<a href="https://docs.dmoj.ca/#/site/api" class="nav-api">
API
</a>
</li>
<li>
<a href="https://github.com/DMOJ/" class="nav-github">
Github
</a>
</li>
</ul> </li>
</ul>
<span id="user-links">
<ul>
<li>
<a href="/user">
<span>
<img src="https://www.gravatar.com/avatar/bb2cfe7e6764cdc86f485d02f084ff85?d=identicon&amp;s=32" height="24" width="24"><span>Hello, <b>bruce</b>.</span>
</span>
</a>
<ul style="width: 150px">
<li><a href="/admin/">Admin</a></li>
<li><a href="/edit/profile/">Edit profile</a></li>
<li>
<form action="/accounts/logout/" method="POST">
<input type='hidden' name='csrfmiddlewaretoken' value='2muLgPsWhgPbnUevlzEqzddWVRfudmQWlmC8PmUXwgpbCILedPBzRSFNBbhles3V' /> <button type="submit">Log out</button>
</form>
</li>
</ul>
</li>
</ul>
</span>
</div>
<div id="nav-shadow"></div>
</nav>
<div id="page-container">
<noscript>
        <div id="noscript">This site works best with JavaScript enabled.</div>
    </noscript>
<br>
<main id="content">
<h2 style="color:#393630; display:inline">
Submission of <a href="/problem/tle16c4p4">TLE &#x27;16 Contest 4 P4 - Christmas Tree Building</a> by <a href="/user/bruce">bruce</a> </h2>
<span class="submission-info">
<span class="submission-date">May 22, 2022, 4:11 p.m.
on Iorwerth
<br>
<span>C++17</span>
[<a href="/admin/judge/submission/4575177/change/">Admin</a>]
</span>
</span>
<hr>
<div id="content-body"> <br>
<div><a href="/src/4575177">View source</a></div>
<div><a href="/problem/tle16c4p4/resubmit/4575177">Resubmit</a></div>
<script src="https://static.dmoj.ca/static/cache/js/output.809c0e5d587c.js"></script> <div>
<form action="/widgets/rejudge" method="post">
<input type='hidden' name='csrfmiddlewaretoken' value='2muLgPsWhgPbnUevlzEqzddWVRfudmQWlmC8PmUXwgpbCILedPBzRSFNBbhles3V' /> <a href="#" onclick="confirm_and_rejudge(parentNode)">Rejudge</a>
<input type="hidden" name="id" value="4575177">
<input type="hidden" name="path" value="/submission/4575177">
</form>
</div>
<br>
<hr class="half-hr">
<br>
<div id="test-cases">
<h3>Execution Results</h3>
<br>
<span class="fa fa-check case-AC"></span>
<span class="fa fa-check case-AC"></span>
<span class="fa fa-check case-AC"></span>
<span class="fa fa-check case-AC"></span>
<span class="fa fa-check case-AC"></span>
<br><br>
<b>Batch #1</b>
(5/5 points)
<br>
<div class="batch-cases">
<table class="submissions-status-table"> <tr id="165748212" class="case-row toggle closed">
<td><b>Case #1:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003926461s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748213" class="case-row toggle closed">
<td><b>Case #2:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003931959s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748214" class="case-row toggle closed">
<td><b>Case #3:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003932365s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748215" class="case-row toggle closed">
<td><b>Case #4:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003943762s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748216" class="case-row toggle closed">
<td><b>Case #5:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003926349s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748217" class="case-row toggle closed">
<td><b>Case #6:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004275239s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748218" class="case-row toggle closed">
<td><b>Case #7:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003994825s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748219" class="case-row toggle closed">
<td><b>Case #8:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003998554s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748220" class="case-row toggle closed">
<td><b>Case #9:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003968248s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748221" class="case-row toggle closed">
<td><b>Case #10:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003960077s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
</table>
</div> <br>
<b>Batch #2</b>
(10/10 points)
<br>
<div class="batch-cases">
<table class="submissions-status-table"> <tr id="165748222" class="case-row toggle closed">
<td><b>Case #1:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004083318s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748223" class="case-row toggle closed">
<td><b>Case #2:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003974874s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748224" class="case-row toggle closed">
<td><b>Case #3:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004021429s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748225" class="case-row toggle closed">
<td><b>Case #4:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004009786s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748226" class="case-row toggle closed">
<td><b>Case #5:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003974244s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748227" class="case-row toggle closed">
<td><b>Case #6:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004038364s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748228" class="case-row toggle closed">
<td><b>Case #7:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004037541s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748229" class="case-row toggle closed">
<td><b>Case #8:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.00403222s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748230" class="case-row toggle closed">
<td><b>Case #9:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004010768s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748231" class="case-row toggle closed">
<td><b>Case #10:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003975479s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
</table>
</div> <br>
<b>Batch #3</b>
(15/15 points)
<br>
<div class="batch-cases">
<table class="submissions-status-table"> <tr id="165748232" class="case-row toggle closed">
<td><b>Case #1:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004037675s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748233" class="case-row toggle closed">
<td><b>Case #2:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003925752s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748234" class="case-row toggle closed">
<td><b>Case #3:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003979733s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748235" class="case-row toggle closed">
<td><b>Case #4:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004016602s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748236" class="case-row toggle closed">
<td><b>Case #5:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004045973s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748237" class="case-row toggle closed">
<td><b>Case #6:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003947709s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748238" class="case-row toggle closed">
<td><b>Case #7:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004026612s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748239" class="case-row toggle closed">
<td><b>Case #8:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003954558s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748240" class="case-row toggle closed">
<td><b>Case #9:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003970002s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748241" class="case-row toggle closed">
<td><b>Case #10:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003939215s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748242" class="case-row toggle closed">
<td><b>Case #11:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003931057s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748243" class="case-row toggle closed">
<td><b>Case #12:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003986621s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748244" class="case-row toggle closed">
<td><b>Case #13:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003974758s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748245" class="case-row toggle closed">
<td><b>Case #14:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004095826s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748246" class="case-row toggle closed">
<td><b>Case #15:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003999107s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748247" class="case-row toggle closed">
<td><b>Case #16:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004015161s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748248" class="case-row toggle closed">
<td><b>Case #17:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004042484s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748249" class="case-row toggle closed">
<td><b>Case #18:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004018743s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748250" class="case-row toggle closed">
<td><b>Case #19:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003950782s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748251" class="case-row toggle closed">
<td><b>Case #20:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004053947s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748252" class="case-row toggle closed">
<td><b>Case #21:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003991912s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748253" class="case-row toggle closed">
<td><b>Case #22:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004019829s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748254" class="case-row toggle closed">
<td><b>Case #23:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003956795s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
</table>
</div> <br>
<b>Batch #4</b>
(25/25 points)
<br>
<div class="batch-cases">
<table class="submissions-status-table"> <tr id="165748255" class="case-row toggle closed">
<td><b>Case #1:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004028427s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748256" class="case-row toggle closed">
<td><b>Case #2:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004222971s">0.004s,</span></td>
<td>5.94 MB]</td>
</tr>
<tr id="165748257" class="case-row toggle closed">
<td><b>Case #3:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.00534127s">0.005s,</span></td>
<td>6.12 MB]</td>
</tr>
<tr id="165748258" class="case-row toggle closed">
<td><b>Case #4:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.006949951s">0.007s,</span></td>
<td>6.52 MB]</td>
</tr>
<tr id="165748259" class="case-row toggle closed">
<td><b>Case #5:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.024787553s">0.025s,</span></td>
<td>8.51 MB]</td>
</tr>
<tr id="165748260" class="case-row toggle closed">
<td><b>Case #6:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.045855046s">0.046s,</span></td>
<td>10.57 MB]</td>
</tr>
<tr id="165748261" class="case-row toggle closed">
<td><b>Case #7:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.005071887s">0.005s,</span></td>
<td>6.91 MB]</td>
</tr>
<tr id="165748262" class="case-row toggle closed">
<td><b>Case #8:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.010999291s">0.011s,</span></td>
<td>6.91 MB]</td>
</tr>
<tr id="165748263" class="case-row toggle closed">
<td><b>Case #9:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.0224166s">0.022s,</span></td>
<td>8.64 MB]</td>
</tr>
<tr id="165748264" class="case-row toggle closed">
<td><b>Case #10:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.029397805s">0.029s,</span></td>
<td>9.23 MB]</td>
</tr>
<tr id="165748265" class="case-row toggle closed">
<td><b>Case #11:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.050599107s">0.051s,</span></td>
<td>10.51 MB]</td>
</tr>
<tr id="165748266" class="case-row toggle closed">
<td><b>Case #12:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.046795866s">0.047s,</span></td>
<td>10.43 MB]</td>
</tr>
<tr id="165748267" class="case-row toggle closed">
<td><b>Case #13:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.049027833s">0.049s,</span></td>
<td>10.58 MB]</td>
</tr>
<tr id="165748268" class="case-row toggle closed">
<td><b>Case #14:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.005095202s">0.005s,</span></td>
<td>6.91 MB]</td>
</tr>
<tr id="165748269" class="case-row toggle closed">
<td><b>Case #15:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.04587889s">0.046s,</span></td>
<td>10.30 MB]</td>
</tr>
<tr id="165748270" class="case-row toggle closed">
<td><b>Case #16:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.048405569s">0.048s,</span></td>
<td>9.96 MB]</td>
</tr>
<tr id="165748271" class="case-row toggle closed">
<td><b>Case #17:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.039189547s">0.039s,</span></td>
<td>10.51 MB]</td>
</tr>
<tr id="165748272" class="case-row toggle closed">
<td><b>Case #18:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.047381752s">0.047s,</span></td>
<td>10.71 MB]</td>
</tr>
<tr id="165748273" class="case-row toggle closed">
<td><b>Case #19:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.005007631s">0.005s,</span></td>
<td>6.91 MB]</td>
</tr>
<tr id="165748274" class="case-row toggle closed">
<td><b>Case #20:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.066140331s">0.066s,</span></td>
<td>14.54 MB]</td>
</tr>
<tr id="165748275" class="case-row toggle closed">
<td><b>Case #21:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.053152357s">0.053s,</span></td>
<td>10.56 MB]</td>
</tr>
</table>
</div> <br>
<b>Batch #5</b>
(45/45 points)
<br>
<div class="batch-cases">
<table class="submissions-status-table"> <tr id="165748276" class="case-row toggle closed">
<td><b>Case #1:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.003958906s">0.004s,</span></td>
<td>5.88 MB]</td>
</tr>
<tr id="165748277" class="case-row toggle closed">
<td><b>Case #2:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004003833s">0.004s,</span></td>
<td>5.89 MB]</td>
</tr>
<tr id="165748278" class="case-row toggle closed">
<td><b>Case #3:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.041992334s">0.042s,</span></td>
<td>10.30 MB]</td>
</tr>
<tr id="165748279" class="case-row toggle closed">
<td><b>Case #4:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.004547671s">0.005s,</span></td>
<td>6.03 MB]</td>
</tr>
<tr id="165748280" class="case-row toggle closed">
<td><b>Case #5:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.005833605s">0.006s,</span></td>
<td>6.23 MB]</td>
</tr>
<tr id="165748281" class="case-row toggle closed">
<td><b>Case #6:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.006643073s">0.007s,</span></td>
<td>6.34 MB]</td>
</tr>
<tr id="165748282" class="case-row toggle closed">
<td><b>Case #7:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.010990963s">0.011s,</span></td>
<td>6.88 MB]</td>
</tr>
<tr id="165748283" class="case-row toggle closed">
<td><b>Case #8:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.025164449s">0.025s,</span></td>
<td>9.33 MB]</td>
</tr>
<tr id="165748284" class="case-row toggle closed">
<td><b>Case #9:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.011462014s">0.011s,</span></td>
<td>7.59 MB]</td>
</tr>
<tr id="165748285" class="case-row toggle closed">
<td><b>Case #10:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.015055777s">0.015s,</span></td>
<td>7.48 MB]</td>
</tr>
<tr id="165748286" class="case-row toggle closed">
<td><b>Case #11:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.023425246s">0.023s,</span></td>
<td>8.70 MB]</td>
</tr>
<tr id="165748287" class="case-row toggle closed">
<td><b>Case #12:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.036080544s">0.036s,</span></td>
<td>9.57 MB]</td>
</tr>
<tr id="165748288" class="case-row toggle closed">
<td><b>Case #13:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.045876196s">0.046s,</span></td>
<td>10.83 MB]</td>
</tr>
<tr id="165748289" class="case-row toggle closed">
<td><b>Case #14:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.011323221s">0.011s,</span></td>
<td>8.34 MB]</td>
</tr>
<tr id="165748290" class="case-row toggle closed">
<td><b>Case #15:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.048779904s">0.049s,</span></td>
<td>10.60 MB]</td>
</tr>
<tr id="165748291" class="case-row toggle closed">
<td><b>Case #16:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.050806675s">0.051s,</span></td>
<td>10.60 MB]</td>
</tr>
<tr id="165748292" class="case-row toggle closed">
<td><b>Case #17:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.048239252s">0.048s,</span></td>
<td>10.61 MB]</td>
</tr>
<tr id="165748293" class="case-row toggle closed">
<td><b>Case #18:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.047138732s">0.047s,</span></td>
<td>10.55 MB]</td>
</tr>
<tr id="165748294" class="case-row toggle closed">
<td><b>Case #19:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.006716058s">0.007s,</span></td>
<td>7.56 MB]</td>
</tr>
<tr id="165748295" class="case-row toggle closed">
<td><b>Case #20:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.051151037s">0.051s,</span></td>
<td>10.56 MB]</td>
</tr>
<tr id="165748296" class="case-row toggle closed">
<td><b>Case #21:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.038737636s">0.039s,</span></td>
<td>10.50 MB]</td>
</tr>
<tr id="165748297" class="case-row toggle closed">
<td><b>Case #22:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.053689262s">0.054s,</span></td>
<td>11.12 MB]</td>
</tr>
<tr id="165748298" class="case-row toggle closed">
<td><b>Case #23:</b></td>
<td>
<span title="Accepted" class="case-AC">AC</span></td>
<td>[<span title="0.067377423s">0.067s,</span></td>
<td>14.54 MB]</td>
</tr>
</table>
</div> <br>
<br>
<b>Resources:</b>
<span title="1.446635412s">1.447s,</span>
14.54 MB
<br>
<b>Maximum single-case runtime:</b>
<span title="0.067377423s">0.067s</span>
<br>
<b>Final score:</b>
100/100
(15.0/15 points)
<br>
</div>
</div>
</main>
<footer>
<span id="footer-content">
<br>
<a style="color: rgb(128, 128, 128)" href="//github.com/DMOJ/">fork us on <span style="font-weight:bold">Github</span></a>  | <a style="color: rgb(128, 128, 128);" href="//www.facebook.com/dmoj.ca">like us on <span style="font-weight: bold;">Facebook</span></a> | <a style="color: rgb(128, 128, 128)" href="https://translate.dmoj.ca/">help us <span style="font-weight: bold;">translate</span></a> | <a style="color: rgb(128, 128, 128)" href="https://dmoj.ca/tos/">terms of service</a> |
<form action="/i18n/setlang/" method="post" style="display: inline">
<input type='hidden' name='csrfmiddlewaretoken' value='2muLgPsWhgPbnUevlzEqzddWVRfudmQWlmC8PmUXwgpbCILedPBzRSFNBbhles3V' /> <input name="next" type="hidden" value="/submission/4575177">
<select name="language" onchange="form.submit()" style="height: 1.5em">
<option value="ca">
català (ca)
</option>
<option value="de">
Deutsch (de)
</option>
<option value="el">
Ελληνικά (el)
</option>
<option value="en" selected>
English (en)
</option>
<option value="es">
español (es)
</option>
<option value="fr">
français (fr)
</option>
<option value="hr">
Hrvatski (hr)
</option>
<option value="hu">
Magyar (hu)
</option>
<option value="ja">
日本語 (ja)
</option>
<option value="ko">
한국어 (ko)
</option>
<option value="pt">
 Português (pt)
</option>
<option value="ro">
Română (ro)
</option>
<option value="ru">
Русский (ru)
</option>
<option value="sr-latn">
srpski (latinica) (sr-latn)
</option>
<option value="tr">
Türkçe (tr)
</option>
<option value="vi">
Tiếng Việt (vi)
</option>
<option value="zh-hans">
简体中文 (zh-hans)
</option>
<option value="zh-hant">
繁體中文 (zh-hant)
</option>
</select>
</form>
</span>
</footer>
</div>
</body>
</html>