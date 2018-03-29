$(document).ready(function() {
	// Initializes and creates emoji set from sprite sheet
	window.emojiPicker = new EmojiPicker({
		emojiable_selector: '[data-emojiable=true]',
		assetsPath: 'img/',
		popupButtonClasses: 'fa fa-smile-o'
	});
	// Finds all elements with `emojiable_selector` and converts them to rich emoji input fields
	// You may want to delay this step if you have dynamically created input fields that appear later in the loading process
	// It can be called as many times as necessary; previously converted input fields will not be converted again
	window.emojiPicker.discover();
});

$(document).ready(function() {
	var div1 = $(".emoji-items-wrap.mobile_scrollable_wrap");
	var div2 = $(".emoji-menu-tabs");
	div1.after(div2);
});
$(document).ready(function() {
	$("#font-btn").click(function() {
		$("#font-controller").toggle();
	});
});

$(function() {
	$('#bold').click(function() {
		var chk = $(".emoji-wysiwyg-editor");
		var checked = chk.css("font-weight");
		if (checked == 700) {
			chk.css("font-weight", "normal");
		} else {
			chk.css("font-weight", "bold");
		}
	});
});

$(function() {
	$('#italics').click(function() {
		var chk = $(".emoji-wysiwyg-editor");
		var checked = chk.css("font-style");
		if (checked == 'italic') {
			chk.css("font-style", "normal");
		} else {
			chk.css("font-style", "italic");
		}
	});
});

$(function() {
	$('#underline').click(function() {
		var chk = $(".emoji-wysiwyg-editor");
		var checked = chk.css("text-decoration");
		if (checked == 'underline solid rgb(51, 51, 51)') {
			chk.css("text-decoration", "none");
		} else {
			chk.css("text-decoration", "underline");
		}
	});
});

$(function() {
	$("button").click(function() {
		var thisEle = $(".emoji-wysiwyg-editor").css("font-size");
		var textFontSize = parseFloat(thisEle, 10);
		var unit = thisEle.slice(-2); //获取单位 
		var cName = $(this).attr("class");
		if (cName == "bigger") {
			if (textFontSize <= 22) {
				textFontSize += 2;
			}
		} else if (cName == "smaller") {
			if (textFontSize >= 12) {
				textFontSize -= 2;
			}
		}
		$(".emoji-wysiwyg-editor").css("font-size", textFontSize + unit);
	});
});