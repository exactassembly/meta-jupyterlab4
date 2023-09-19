SUMMARY = "Python package for providing Mozilla's CA Bundle."
HOMEPAGE = "https://github.com/certifi/python-certifi"
AUTHOR = "Kenneth Reitz <me@kennethreitz.com>"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3c2b7404369c587c3559afb604fce2f2"

SRC_URI[md5sum] = "10a72845d3fc2c38d212b4b7b1872c76"
SRC_URI[sha256sum] = "539cc1d13202e33ca466e88b2807e29f4c13049d6d87031a3c110744495cb082"

PYPI_PACKAGE = "certifi"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"

