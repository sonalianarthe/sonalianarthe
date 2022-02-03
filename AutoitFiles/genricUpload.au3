;Wait for 2000 seconds to get the upload popup
Local $windId=WinWait("[CLASS:#32770]","",2000)
;Set focus in file name field
ControlFocus($windId,"","Edit1")
;Enter text inside file name field
ControlSetText($windId,"","Edit1","F:\maven2\selenium\AutoitFiles\fileUsedtoUpload.txt")
;Click on open button
ControlClick($windId,"","Button1")








