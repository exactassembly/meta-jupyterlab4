SUMMARY = "The Real First Universal Charset Detector. Open, modern and actively maintained alternative to Chardet."
HOMEPAGE = "https://github.com/Ousret/charset_normalizer"
AUTHOR = "Ahmed TAHRI <ahmed.tahri@cloudnursery.dev>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0974a390827087287db39928f7c524b5"

SRC_URI[md5sum] = "dbb8c5b745beddbaae67d06dce0b7c29"
SRC_URI[sha256sum] = "3bb3d25a8e6c0aedd251753a79ae98a093c7e7b471faa3aa9a93a81431987ace"

PYPI_PACKAGE = "charset-normalizer"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
	${PYTHON_PN}-core \
	${PYTHON_PN}-logging \
	${PYTHON_PN}-codecs \
	${PYTHON_PN}-json \
"

BBCLASSEXTEND = "native nativesdk"
